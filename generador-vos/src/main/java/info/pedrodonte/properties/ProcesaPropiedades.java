package info.pedrodonte.properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ProcesaPropiedades {


	private static ProcesaPropiedades INSTANCIA;
	private Properties configuracion;
	public ProcesaPropiedades() {
		inicializarLecturaArchivo();
	}
	private static void crearInstancia() {
		if (INSTANCIA == null) {
			if (INSTANCIA == null) {
				INSTANCIA = new ProcesaPropiedades();
			}
		}
	}
	public static ProcesaPropiedades getInstancia() {
		crearInstancia();
        return INSTANCIA;
    }
	
	private void inicializarLecturaArchivo() {
		configuracion = PropiedadesManager.getInstancia()
				.leerArchivoConfiguracion();
	}

	public static void main(String[] args) {
		getInstancia().obtenerConfiguracion();
	}
	

	
	public Map<String, Object> obtenerConfiguracion(){
		Map<String, Object> propieades = new HashMap<String, Object>();
		propieades.put(PropiedadesManager.PREFIJO_ENTIDA, proListado(configuracion.getProperty(PropiedadesManager.PREFIJO_ENTIDA)));
		propieades.put(PropiedadesManager.LIST_NEGRA_ATR, proListado(configuracion.getProperty(PropiedadesManager.LIST_NEGRA_ATR)));
		propieades.put(PropiedadesManager.PAQUETE_ORIGEN, configuracion.getProperty(PropiedadesManager.PAQUETE_ORIGEN));
		propieades.put(PropiedadesManager.PAQUETE_DESTIN, configuracion.getProperty(PropiedadesManager.PAQUETE_DESTIN));
		
//		System.out.println("Retornando Propiedades al Cliente del Manager");
//		System.out.println(PropiedadesManager.PAQUETE_ORIGEN+":"+propieades.get(PropiedadesManager.PAQUETE_ORIGEN));
//		System.out.println(PropiedadesManager.PAQUETE_DESTIN+":"+propieades.get(PropiedadesManager.PAQUETE_DESTIN));
//		System.out.println(PropiedadesManager.PREFIJO_ENTIDA+":"+propieades.get(PropiedadesManager.PREFIJO_ENTIDA));
//		System.out.println(PropiedadesManager.LIST_NEGRA_ATR+":"+propieades.get(PropiedadesManager.LIST_NEGRA_ATR));
		
		return propieades;
	}
	
	private List<String> proListado(String propertie){
		List<String> listado = new ArrayList<String>();
		
		String[] props = propertie.split(",");
		for (int i = 0; i < props.length; i++) {
			listado.add( props[i].trim() );
		}
		
		return listado;
	}

}
