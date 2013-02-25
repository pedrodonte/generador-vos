package info.pedrodonte.generador.dto;

import static info.pedrodonte.generador.dto.ClaseVO.NL;
import info.pedrodonte.properties.ProcesaPropiedades;
import info.pedrodonte.properties.PropiedadesManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

public class GeneradorDTO {

	private Logger logger = Logger.getLogger("GeneradorDTO");

	private List<String> prefijosEntidadesNegocio = null;
	private List<String> listaNegraatributos = null;
	private List<ClaseVO> vos = new ArrayList<ClaseVO>();

	private String paqueteEntidades = null;
	private String paqueteCodigoGenerado = null;

	private boolean isGenerarVOS = true;
	private boolean isGenerarToStringVOS = true;
	private boolean isHelperVOBetweenEntity = true;

	private StringBuilder contenidoHelperVoEntity = new StringBuilder();
	private String nombreClaseHelperVoEntity = "HelperVoEntity";
	private StringBuilder importsClaseHelperVoEntity = new StringBuilder();

	private boolean isTest = false;

	@SuppressWarnings("unchecked")
	public GeneradorDTO() {
		super();
		prefijosEntidadesNegocio = (List<String>) ProcesaPropiedades
				.getInstancia().obtenerConfiguracion()
				.get(PropiedadesManager.PREFIJO_ENTIDA);
		listaNegraatributos = (List<String>) ProcesaPropiedades.getInstancia()
				.obtenerConfiguracion().get(PropiedadesManager.LIST_NEGRA_ATR);

		paqueteEntidades = (String) ProcesaPropiedades.getInstancia()
				.obtenerConfiguracion().get(PropiedadesManager.PAQUETE_ORIGEN);
		paqueteCodigoGenerado = (String) ProcesaPropiedades.getInstancia()
				.obtenerConfiguracion().get(PropiedadesManager.PAQUETE_DESTIN);
	}

	@SuppressWarnings("rawtypes")
	public void generar() {

		System.out.println(isGenerarVOS + "-" + isGenerarToStringVOS + "-"
				+ isHelperVOBetweenEntity);

		contenidoHelperVoEntity.append(NL + "public class "
				+ nombreClaseHelperVoEntity + "{\n" + NL);

		try {
			Class[] lasClases = obtenerClasesDelPaquete(paqueteEntidades);

			logger.info(lasClases.length + " Clases encontradas, en "
					+ paqueteEntidades);

			for (int i = 0; i < lasClases.length; i++) {
				Class clase = lasClases[i];
				importsClaseHelperVoEntity.append("import " + clase.getName()
						+ ";" + NL);
				construirVO(clase);
			}

			contenidoHelperVoEntity.append(NL + "}");

			if (isHelperVOBetweenEntity) {
				grabarArchivodeHelper(paqueteCodigoGenerado,
						contenidoHelperVoEntity, getPathArchivosGenerados());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param clase
	 */
	@SuppressWarnings("rawtypes")
	private void construirVO(Class clase) {
		Field[] atributos = clase.getDeclaredFields();

		ClaseVO claseVO = new ClaseVO();
		claseVO.setNombreEntity(clase.getSimpleName());
		claseVO.setNombreVO(cambioNombreEntityToVO(clase.getSimpleName()));

		for (int i = 0; i < atributos.length; i++) {
			Field atributo = atributos[i];
			if (!estaEnListaNegraAtributos(atributo.getName())) {
				AtributoVO atributoVO = getDeficinionAtributoVO(atributo);
				claseVO.setAtributo(atributoVO);
			}

		}
		// claseVO.getSetEntity();
		vos.add(claseVO);
		System.out.println("Generando " + claseVO.getNombreVO() + " "
				+ claseVO.getAtributos().size() + " atributos");
		claseVO.setPaqueteContenedorOrigen(paqueteEntidades);
		claseVO.setGenerarToStringVOS(isGenerarToStringVOS);

		claseVO.imprimirConstantesCampos();

		if (isGenerarVOS) {
			claseVO.grabarArchivodeClaseJava(paqueteCodigoGenerado,
					getPathArchivosGenerados());
		}

		if (isHelperVOBetweenEntity) {
			contenidoHelperVoEntity.append(claseVO
					.generarContenidoArchivoHelperVO(paqueteCodigoGenerado));
		}

		System.out.println(NL + "" + NL);
	}

	private String getPathArchivosGenerados() {
		String path = "";
		if (isTest) {
			path = "src/test/java/";
		} else {
			path = "src/main/java/";
		}
		File file = new File(path);
		//System.out.println("Utilizando el PATH:" + path);
		return file.getAbsolutePath();
	}

	private AtributoVO getDeficinionAtributoVO(Field atributo) {

		AtributoVO atributoVO = new AtributoVO();

		String nombreAtributo = atributo.getName();
		String nombreType = atributo.getType().getSimpleName();

		atributoVO.setNombreAtributoEnti(nombreAtributo);
		atributoVO.setTipoAtributoEnti(nombreType);
		String nombrePackageType = atributo.getType().getCanonicalName();

		atributoVO.setTipoAtributoEntiPaquete(nombrePackageType);

		// ahora se adaptan los nombres a vo

		nombreType = cambioNombreEntityToVO(nombreType);
		nombreAtributo = cambioNombreEntityToVO(nombreAtributo);

		atributoVO.setNombreAtributoVO(nombreAtributo);
		atributoVO.setTipoAtributoVO(nombreType);

		return atributoVO;
	}

	private String cambioNombreEntityToVO(String nombreAtributo) {
		System.out.println("entra "+nombreAtributo);
		for (String prefijo : getSufijosNegocio()) {
			nombreAtributo = nombreAtributo.replace(prefijo, "Vo");
		}

		for (String prefijo : getSufijosNegocio()) {
			String prefijoMinusculas = prefijo;
			prefijoMinusculas = prefijoMinusculas.substring(0, 1).toLowerCase()
					+ prefijoMinusculas.substring(1);
			
			nombreAtributo = nombreAtributo.replace(prefijoMinusculas, "vo");
			
		}
		System.out.println("sale "+nombreAtributo);
		return nombreAtributo;
	}

	private boolean estaEnListaNegraAtributos(String name) {
		for (String prefijo : listaNegraatributos) {
			if (prefijo.equals(name)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	private Class[] obtenerClasesDelPaquete(String packageName)
			throws ClassNotFoundException, IOException {

		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();

		assert classLoader != null;

		String path = packageName.replace('.', '/');
		logger.info("path: " + path);

		Enumeration<URL> resources = classLoader.getResources(path);

		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
			logger.info(resource.toString());
		}

		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(buscarClasesEnDirectorio(directory, packageName));
		}

		return classes.toArray(new Class[classes.size()]);
	}

	@SuppressWarnings("rawtypes")
	private List<Class> buscarClasesEnDirectorio(File directory,
			String packageName) throws ClassNotFoundException {

		String fixPath = directory.getAbsolutePath().replace("%20", " ");
		logger.info("fixPath : " + fixPath);

		directory = new File(fixPath);

		logger.info("directory : " + directory.getAbsolutePath());
		logger.info("packageName : " + packageName);

		List<Class> classes = new ArrayList<Class>();

		if (!directory.exists()) {
			logger.info("directory.exists() : " + directory.exists());
			return classes;
		}

		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {

				assert !file.getName().contains(".");
				classes.addAll(buscarClasesEnDirectorio(file, packageName + "."
						+ file.getName()));

			} else if (file.getName().endsWith(".class")) {

				classes.add(Class.forName(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6)));

			}
		}
		return classes;
	}

	public String getPaqueteEntidades() {
		return paqueteEntidades;
	}

	public void setPaqueteEntidades(String paqueteEntidades) {
		this.paqueteEntidades = paqueteEntidades;
	}

	public String getPaqueteCodigoGenerado() {
		return paqueteCodigoGenerado;
	}

	public void setPaqueteCodigoGenerado(String paqueteCodigoGenerado) {
		this.paqueteCodigoGenerado = paqueteCodigoGenerado;
	}

	public boolean isGenerarVOS() {
		return isGenerarVOS;
	}

	public void setGenerarVOS(boolean isGenerarVOS) {
		this.isGenerarVOS = isGenerarVOS;
	}

	public boolean isHelperVOBetweenEntity() {
		return isHelperVOBetweenEntity;
	}

	public void setHelperVOBetweenEntity(boolean isHelperVOBetweenEntity) {
		this.isHelperVOBetweenEntity = isHelperVOBetweenEntity;
	}

	public void grabarArchivodeHelper(String paqueteCodigoGenerado,
			StringBuilder contenido, String path) {
		String folderCodigoGenerado = paqueteCodigoGenerado.replace(".", "\\");
		String filename = path + File.separatorChar + folderCodigoGenerado
				+ File.separatorChar + nombreClaseHelperVoEntity + ".java";

		System.out.println("path: " + path);
		System.out.println("paqueteCodigoGenerado: " + paqueteCodigoGenerado);
		System.out.println("folderCodigoGenerado: " + folderCodigoGenerado);
		System.out.println("filename: " + filename);

		contenido.insert(0, importsClaseHelperVoEntity.toString());

		contenido
				.insert(0,
						NL
								+ "/* En caso de cambiar el modelo de datos, esta clase debe ser modificada o volver a generar. */"
								+ NL + NL);
		contenido.insert(0, NL + "* FECHA CREACION: " + new Date().toString()
				+ " */" + NL);
		contenido.insert(0, NL + "/* CLASE - AUTOGENERADA" + NL);

		contenido.insert(0, "package " + paqueteCodigoGenerado + ";" + NL);

		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println(contenido.toString());
			salida.close();
		} catch (IOException e) {
			System.out.println("Error al escribir el Archivo");
			e.printStackTrace();
		}
	}

	public List<String> getSufijosNegocio() {
		return prefijosEntidadesNegocio;
	}

	public void setSufijosNegocio(List<String> sufijosNegocio) {
		this.prefijosEntidadesNegocio = sufijosNegocio;
	}

	public void setTest(boolean b) {
		this.isTest = b;
	}

}
