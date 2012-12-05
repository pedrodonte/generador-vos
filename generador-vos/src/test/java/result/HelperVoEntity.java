package result;

/* CLASE - AUTOGENERADA

* FECHA CREACION: Tue Nov 27 16:48:54 CLST 2012 */

/* En caso de cambiar el modelo de datos, esta clase debe ser modificada o volver a generar. */

import entities.SeguTabPerfil;
import entities.SeguTabUsua;

public class HelperVoEntity{


	/** Transforma un objeto tipo SeguTabPerfil en uno nuevo de tipo VoPerfil */
	public VoPerfil toVO(SeguTabPerfil seguTabPerfil){
		VoPerfil voPerfil = new VoPerfil();
		try{ 
			voPerfil.setPerfilCodPerfil(seguTabPerfil.getPerfilCodPerfil());
			voPerfil.setPerfilBooCodVigente(seguTabPerfil.getPerfilBooCodVigente());
			voPerfil.setPerfilDescripcion(seguTabPerfil.getPerfilDescripcion());
			voPerfil.setPerfilIcono(seguTabPerfil.getPerfilIcono());
			voPerfil.setPerfilIdentificadorJaas(seguTabPerfil.getPerfilIdentificadorJaas());
			voPerfil.setPerfilNombre(seguTabPerfil.getPerfilNombre());
			voPerfil.setRegUsuaCrea(seguTabPerfil.getRegUsuaCrea());
			voPerfil.setRegUsuaModifica(seguTabPerfil.getRegUsuaModifica());
		}catch(java.lang.NullPointerException e){/*seteando valores nulos, es normal.*/} 
		return voPerfil;
	}

	/** Transforma un objeto tipo VoPerfil en uno nuevo de tipo SeguTabPerfil */
	public SeguTabPerfil toEntity(VoPerfil voPerfil){
		SeguTabPerfil seguTabPerfil = new SeguTabPerfil();
		seguTabPerfil.setPerfilCodPerfil(voPerfil.getPerfilCodPerfil());
		seguTabPerfil.setPerfilBooCodVigente(voPerfil.getPerfilBooCodVigente());
		seguTabPerfil.setPerfilDescripcion(voPerfil.getPerfilDescripcion());
		seguTabPerfil.setPerfilIcono(voPerfil.getPerfilIcono());
		seguTabPerfil.setPerfilIdentificadorJaas(voPerfil.getPerfilIdentificadorJaas());
		seguTabPerfil.setPerfilNombre(voPerfil.getPerfilNombre());
		seguTabPerfil.setRegUsuaCrea(voPerfil.getRegUsuaCrea());
		seguTabPerfil.setRegUsuaModifica(voPerfil.getRegUsuaModifica());
		return seguTabPerfil;
	}

	/** Transforma un objeto tipo SeguTabUsua en uno nuevo de tipo VoUsua */
	public VoUsua toVO(SeguTabUsua seguTabUsua){
		VoUsua voUsua = new VoUsua();
		try{ 
			voUsua.setUsuaCodUsua(seguTabUsua.getUsuaCodUsua());
			voUsua.setRegUsuaCrea(seguTabUsua.getRegUsuaCrea());
			voUsua.setRegUsuaModifica(seguTabUsua.getRegUsuaModifica());
			voUsua.setUsuaApellidos(seguTabUsua.getUsuaApellidos());
			voUsua.setUsuaBooCodBloqueado(seguTabUsua.getUsuaBooCodBloqueado());
			voUsua.setUsuaCantIntentos(seguTabUsua.getUsuaCantIntentos());
			voUsua.setUsuaContrasena(seguTabUsua.getUsuaContrasena());
			voUsua.setUsuaDscDv(seguTabUsua.getUsuaDscDv());
			voUsua.setUsuaEmail(seguTabUsua.getUsuaEmail());
			voUsua.setUsuaFecCreacion(seguTabUsua.getUsuaFecCreacion());
			voUsua.setUsuaFecFinVigencia(seguTabUsua.getUsuaFecFinVigencia());
			voUsua.setUsuaFecIniVigencia(seguTabUsua.getUsuaFecIniVigencia());
			voUsua.setUsuaFecModificacion(seguTabUsua.getUsuaFecModificacion());
			voUsua.setUsuaNombres(seguTabUsua.getUsuaNombres());
			voUsua.setUsuaNumRun(seguTabUsua.getUsuaNumRun());
			voUsua.setVoPerfil( toVO(seguTabUsua.getSeguTabPerfil()) );
		}catch(java.lang.NullPointerException e){/*seteando valores nulos, es normal.*/} 
		return voUsua;
	}

	/** Transforma un objeto tipo VoUsua en uno nuevo de tipo SeguTabUsua */
	public SeguTabUsua toEntity(VoUsua voUsua){
		SeguTabUsua seguTabUsua = new SeguTabUsua();
		seguTabUsua.setUsuaCodUsua(voUsua.getUsuaCodUsua());
		seguTabUsua.setRegUsuaCrea(voUsua.getRegUsuaCrea());
		seguTabUsua.setRegUsuaModifica(voUsua.getRegUsuaModifica());
		seguTabUsua.setUsuaApellidos(voUsua.getUsuaApellidos());
		seguTabUsua.setUsuaBooCodBloqueado(voUsua.getUsuaBooCodBloqueado());
		seguTabUsua.setUsuaCantIntentos(voUsua.getUsuaCantIntentos());
		seguTabUsua.setUsuaContrasena(voUsua.getUsuaContrasena());
		seguTabUsua.setUsuaDscDv(voUsua.getUsuaDscDv());
		seguTabUsua.setUsuaEmail(voUsua.getUsuaEmail());
		seguTabUsua.setUsuaFecCreacion(voUsua.getUsuaFecCreacion());
		seguTabUsua.setUsuaFecFinVigencia(voUsua.getUsuaFecFinVigencia());
		seguTabUsua.setUsuaFecIniVigencia(voUsua.getUsuaFecIniVigencia());
		seguTabUsua.setUsuaFecModificacion(voUsua.getUsuaFecModificacion());
		seguTabUsua.setUsuaNombres(voUsua.getUsuaNombres());
		seguTabUsua.setUsuaNumRun(voUsua.getUsuaNumRun());
		seguTabUsua.setSeguTabPerfil( toEntity(voUsua.getVoPerfil()) );
		return seguTabUsua;
	}

}
