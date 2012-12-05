package info.pedrodonte.generador.dto;

import info.pedrodonte.properties.ProcesaPropiedades;
import info.pedrodonte.properties.PropiedadesManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClaseVO {
	
	public static final String NL = "\n";
	public static final String TB = "\t";
	
	private String paqueteContenedorDestino;
	private String paqueteContenedorOrigen;
	
	private String nombreVO;
	private String nombreEntity;
	
	private boolean isGenerarToStringVOS = true;
	
	private List<AtributoVO> atributos = new ArrayList<AtributoVO>();
	
	private StringBuilder contenidoClase = new StringBuilder();
	
	private String[] paquetesNoImportables = {"long","java.lang"};

	public String getNombreVO() {
		return nombreVO;
	}

	public void setNombreVO(String nombreVO) {
		this.nombreVO = nombreVO;
	}

	public String getNombreEntity() {
		return nombreEntity;
	}

	public void setNombreEntity(String nombreEntity) {
		this.nombreEntity = nombreEntity;
	}

	public List<AtributoVO> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<AtributoVO> atributos) {
		this.atributos = atributos;
	}
	
	public void setAtributo(AtributoVO atributoVO){
		this.atributos.add(atributoVO);
	}
	
	public String getNombreCamelMinuscula(String nombreAtributoVO) {
		return nombreAtributoVO.substring(0, 1).toLowerCase()+nombreAtributoVO.substring(1);
	}
	
	public void grabarArchivodeClaseJava(String paqueteCodigoGenerado, String path){
		setPaqueteContenedor(paqueteCodigoGenerado);
		paqueteCodigoGenerado = paqueteCodigoGenerado.replace(".", "\\");
		String filename = path+paqueteCodigoGenerado+"/"+nombreVO+".java";
		String content = generarContenidoClase();
		
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(content);
            salida.close();
        }
        catch(IOException e) {
          System.out.println("Error al escribir el Archivo");
          e.printStackTrace();
        }
	}

	private String generarContenidoClase() {
		contenidoClase = new StringBuilder();
		
		contenidoClase.append("package "+paqueteContenedorDestino+";\n"+NL);
		
		contenidoClase.append(NL+"/* CLASE - AUTOGENERADA");
		contenidoClase.append(NL+" * FECHA CREACION: "+new Date()+" */"+NL);		
		
		contenidoClase.append(generarImports());
		
		contenidoClase.append("public class "+nombreVO+" implements Serializable{"+NL);
		
		Date fechaActual = new Date();
		long serialVersionUID = fechaActual.getTime();		
		contenidoClase.append(NL+TB+"private static final long serialVersionUID = "+ serialVersionUID +"L;"+NL );
		
		contenidoClase.append(generarBloqueAtributos());
		contenidoClase.append(NL+TB+"public "+nombreVO+"(){\n\t}"+NL);
		contenidoClase.append(generarBloqueSetterGetters());
		
		contenidoClase.append(generarMetodoToString());
		
		contenidoClase.append(NL+"}");
		return contenidoClase.toString();
	}

	/*Sufrido metodo para generar el toString()*/
	private String generarMetodoToString() {
		StringBuilder  sb = new StringBuilder();
		sb.append(TB+"@Override"+NL);
		sb.append(TB+"public String toString(){"+NL);
		sb.append(TB+TB+" return \""+nombreVO+"[");
		
		int i=0;
		for (AtributoVO attr : atributos) {
			if (i!=0) {
				sb.append(attr.getNombreAtributoVO()+"=\"+"+attr.getNombreAtributoVO());
			}else{
				sb.append(attr.getNombreAtributoVO()  +"=\"+"+attr.getNombreAtributoVO());//primera linea
			}
			
			i++;
			if(i==atributos.size()){
				sb.append("+\"]\";"+NL);//ultima linea
			}else{
				sb.append(NL+TB+"\t +\",");
			}
			
		}
		
		//sb.replace(sb.toString().length()-2, sb.toString().length(), "\"]\";"+NL);
		sb.append(TB+"}"+NL);
		return sb.toString();
	}

	private String generarImports() {
		StringBuilder  sb = new StringBuilder();
		//System.out.println("tiene "+atributos.size()+" atributos");
		Map<String, String> importables = new HashMap<String, String>();
		for (AtributoVO atributoVO : atributos) {
			if(!isNoImportable(atributoVO.getNombrePackageType()) 
					&& !importables.containsValue(atributoVO.getNombrePackageType()) 
					&& !atributoVO.getNombrePackageType().startsWith(paqueteContenedorOrigen)){
				sb.append("import "+atributoVO.getNombrePackageType()+";"+NL);
				importables.put(atributoVO.getNombrePackageType(), atributoVO.getNombrePackageType());
			}
			
		}
		sb.append("import java.io.Serializable;\n"+NL);
		return sb.toString();
	}

	private boolean isNoImportable(String type) {
		for (int i = 0; i < paquetesNoImportables.length; i++) {
			if(type.startsWith(paquetesNoImportables[i])){
				return true;
			}
		}
		return false;
	}

	private String generarBloqueAtributos() {
		StringBuilder  sb = new StringBuilder();
		//System.out.println("tiene "+atributos.size()+" atributos");
		for (AtributoVO atributoVO : atributos) {
			sb.append(TB+"private "+atributoVO.getTipoAtributoVO()+" "+atributoVO.getNombreAtributoVO()+";"+NL);
		}
		return sb.toString();
	}
	
	private String generarBloqueSetterGetters() {
		StringBuilder  sb = new StringBuilder();
		for (AtributoVO atributoVO : atributos) {
			sb.append(TB+""+atributoVO.getSeter()+NL+"");
			sb.append(TB+""+atributoVO.getGeter()+NL+"");
		}
		return sb.toString();
	}

	public String getPaqueteContenedor() {
		return paqueteContenedorDestino;
	}

	public void setPaqueteContenedor(String paqueteContenedor) {
		this.paqueteContenedorDestino = paqueteContenedor;
	}

	public String getPaqueteContenedorOrigen() {
		return paqueteContenedorOrigen;
	}

	public void setPaqueteContenedorOrigen(String paqueteContenedorOrigen) {
		this.paqueteContenedorOrigen = paqueteContenedorOrigen;
	}

	public String getSetterToVODeficionion(AtributoVO atributoVO) {
		String definicion = "";
		if (isTieneUnPrefijo(atributoVO)) {
			definicion = getNombreCamelMinuscula(nombreVO) + "."
					+ atributoVO.getSeterNombreVO() + "( toVO("
					+ getNombreCamelMinuscula(nombreEntity) + "."
					+ atributoVO.getGeterNombreEntity() + ") );";

		} else {
			definicion = getNombreCamelMinuscula(nombreVO) + "."
					+ atributoVO.getSeterNombreVO() + "("
					+ getNombreCamelMinuscula(nombreEntity) + "."
					+ atributoVO.getGeterNombreEntity() + ");";

		}
		
		System.out.println("definicion: " + definicion);
		return definicion;
	}

	public String getSetterToEntityDeficionion(AtributoVO atributoVO) {
		String definicion = "";
		if (isTieneUnPrefijo(atributoVO)) {
			definicion = getNombreCamelMinuscula(nombreEntity) + "."
					+ atributoVO.getSeterNombreEntity() + "( toEntity("
					+ getNombreCamelMinuscula(nombreVO) + "."
					+ atributoVO.getGeterNombreVO() + ") );";
		} else {
			definicion = getNombreCamelMinuscula(nombreEntity) + "."
					+ atributoVO.getSeterNombreEntity() + "("
					+ getNombreCamelMinuscula(nombreVO) + "."
					+ atributoVO.getGeterNombreEntity() + ");";
		}

		System.out.println("definicion: " + definicion);
		return definicion;
	}

	public boolean isTieneUnPrefijo(AtributoVO atributoVO){
		@SuppressWarnings("unchecked")
		List<String> preFijos = (List<String>) ProcesaPropiedades.getInstancia().obtenerConfiguracion().get(PropiedadesManager.PREFIJO_ENTIDA);
		for (String prefijo : preFijos) {
			if(atributoVO.getTipoAtributoEnti().startsWith(prefijo)){
				System.out.println(prefijo+" == "+atributoVO.getTipoAtributoEnti());
				return true;
			}
		}
		return false;
	}

	public String getHelperEntityToVO(){
		StringBuilder sb = new StringBuilder();
		sb.append(NL+TB+"/** Transforma un objeto tipo "+ nombreEntity +" en uno nuevo de tipo "+ nombreVO +" */"+NL);
		sb.append(TB+"public "+nombreVO+" toVO("+nombreEntity+" "+ getNombreCamelMinuscula(nombreEntity)+"){"+NL);
		sb.append(TB+TB+""+nombreVO+" "+getNombreCamelMinuscula(nombreVO)+" = new "+nombreVO+"();"+NL);
		sb.append(TB+TB+"try{ "+NL);
		for (AtributoVO atributoVO : atributos) {
			sb.append(TB+TB+"\t"+getSetterToVODeficionion(atributoVO)+NL+"");//
		}
		sb.append(TB+TB+"}catch(java.lang.NullPointerException e){/*seteando valores nulos, es normal.*/} "+NL);
		sb.append(TB+TB+"return "+getNombreCamelMinuscula(nombreVO)+";"+NL);
		sb.append(TB+"}"+NL);
		//System.out.println(sb);
		return sb.toString();
	}
	
	public String getHelperVoToEntity(){
		StringBuilder sb = new StringBuilder();
		sb.append(NL+TB+"/** Transforma un objeto tipo "+ nombreVO +" en uno nuevo de tipo "+ nombreEntity +" */"+NL);
		sb.append(TB+"public "+nombreEntity+" toEntity("+nombreVO+" "+ getNombreCamelMinuscula(nombreVO)+"){"+NL);
		sb.append(TB+TB+""+nombreEntity+" "+getNombreCamelMinuscula(nombreEntity)+" = new "+nombreEntity+"();"+NL);
		for (AtributoVO atributoVO : atributos) {
			sb.append(TB+TB+""+getSetterToEntityDeficionion(atributoVO)+NL+"");//
		}
		sb.append(TB+TB+"return "+getNombreCamelMinuscula(nombreEntity)+";"+NL);
		sb.append(TB+"}"+NL);
		//System.out.println(sb);
		return sb.toString();
	}
	

	public String generarContenidoArchivoHelperVO(String paqueteCodigoGenerado) {
		StringBuilder sb = new StringBuilder();
		sb.append(getHelperEntityToVO());
		sb.append(getHelperVoToEntity());
		return sb.toString();
	}

	public boolean isGenerarToStringVOS() {
		return isGenerarToStringVOS;
	}

	public void setGenerarToStringVOS(boolean isGenerarToStringVOS) {
		this.isGenerarToStringVOS = isGenerarToStringVOS;
	}

	public void imprimirConstantesCampos() {
		StringBuilder sb = new StringBuilder();
		for (AtributoVO atributoVO : atributos) {
			String nombreAtributo = atributoVO.getNombreAtributoEnti();
			sb.append("public static final String "+stringFormatoConstante(nombreAtributo).toUpperCase()+" = \""+ nombreAtributo +"\";"+NL);//
		}
		//System.out.println(sb.toString());
	}
	
	public String stringFormatoConstante(String str) {
		String x = str;
		for (int i = 0; i < x.length(); i++) {
			if (i>0 && Character.isUpperCase(x.charAt(i))){
				str = str.replace(x.charAt(i)+"", "_" + x.charAt(i));
			}				
		}
		return str;
	}

}
