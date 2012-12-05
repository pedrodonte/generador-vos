package info.pedrodonte.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropiedadesManager {
	
	private static PropiedadesManager INSTANCIA;
	public PropiedadesManager() {}
	private static void crearInstancia() {
		if (INSTANCIA == null) {
			if (INSTANCIA == null) {
				INSTANCIA = new PropiedadesManager();
			}
		}
	}
	public static PropiedadesManager getInstancia() {
		crearInstancia();
        return INSTANCIA;
    }
	
	/*METODOS DE LA CLASE*/
	public static final String ARCHIVO_CONFIGURACION = "generadorvo.properties";
	public static final String PAQUETE_ORIGEN = "paquete.origen";
	public static final String PAQUETE_DESTIN = "paquete.destino";
	public static final String PREFIJO_ENTIDA = "prefijos.entidades";
	public static final String LIST_NEGRA_ATR = "listanegra.atributos.entidades";
	
	public static void main(String[] args) {
		getInstancia().leerArchivoConfiguracion();
		
	}
	
	public Properties leerArchivoConfiguracion(){
		Properties prop = null;
		if (comprobarExistenciaArchivo()) {
			
			prop = new Properties();
			 
	    	try {
	            //carga propiedades del archivo
	    		prop.load(new FileInputStream(ARCHIVO_CONFIGURACION));
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
	        }
			
		}else{
			System.out.println("El Archivo no Existe, se creará automaticamente.");
			crearArchivoPropiedades();
			System.out.println("Ejecute de nuevo el metodo.");
		}
		return prop;
	}
	
	private boolean comprobarExistenciaArchivo(){
		File archivo = new File(ARCHIVO_CONFIGURACION);
		if(archivo.exists()){
			return true;
		}
		return false;
	}
	
	protected void crearArchivoPropiedades(){
		Properties prop = new Properties();
		 
    	try {
    		//definicion de propiedades y sus valores.
    		prop.setProperty(PAQUETE_ORIGEN, "paquete.por.defecto");
    		prop.setProperty(PAQUETE_DESTIN, "paquete.por.defecto");
    		prop.setProperty(PREFIJO_ENTIDA, "pUno, pDos, pTres");
    		prop.setProperty(LIST_NEGRA_ATR, "serialVersionUID, otroAtributo");
 
    		//Guarda el archivo en la raiz del proyecto.
    		prop.store(new FileOutputStream(ARCHIVO_CONFIGURACION), "Archivo Configuración Generador VO");
    		System.out.println("Archivo Creado con Exito");
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
	}
	


}
