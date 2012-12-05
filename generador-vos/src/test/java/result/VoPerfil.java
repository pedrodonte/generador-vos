package result;


/* CLASE - AUTOGENERADA
 * FECHA CREACION: Tue Nov 27 16:48:54 CLST 2012 */
import java.math.BigDecimal;
import java.io.Serializable;

public class VoPerfil implements Serializable{

	private static final long serialVersionUID = 1354045734798L;
	private long perfilCodPerfil;
	private Boolean perfilBooCodVigente;
	private String perfilDescripcion;
	private String perfilIcono;
	private String perfilIdentificadorJaas;
	private String perfilNombre;
	private BigDecimal regUsuaCrea;
	private BigDecimal regUsuaModifica;

	public VoPerfil(){
	}
	public void setPerfilCodPerfil(long perfilCodPerfil){
		this.perfilCodPerfil=perfilCodPerfil;
	}
	public long getPerfilCodPerfil(){
		return this.perfilCodPerfil;
	}
	public void setPerfilBooCodVigente(Boolean perfilBooCodVigente){
		this.perfilBooCodVigente=perfilBooCodVigente;
	}
	public Boolean getPerfilBooCodVigente(){
		return this.perfilBooCodVigente;
	}
	public void setPerfilDescripcion(String perfilDescripcion){
		this.perfilDescripcion=perfilDescripcion;
	}
	public String getPerfilDescripcion(){
		return this.perfilDescripcion;
	}
	public void setPerfilIcono(String perfilIcono){
		this.perfilIcono=perfilIcono;
	}
	public String getPerfilIcono(){
		return this.perfilIcono;
	}
	public void setPerfilIdentificadorJaas(String perfilIdentificadorJaas){
		this.perfilIdentificadorJaas=perfilIdentificadorJaas;
	}
	public String getPerfilIdentificadorJaas(){
		return this.perfilIdentificadorJaas;
	}
	public void setPerfilNombre(String perfilNombre){
		this.perfilNombre=perfilNombre;
	}
	public String getPerfilNombre(){
		return this.perfilNombre;
	}
	public void setRegUsuaCrea(BigDecimal regUsuaCrea){
		this.regUsuaCrea=regUsuaCrea;
	}
	public BigDecimal getRegUsuaCrea(){
		return this.regUsuaCrea;
	}
	public void setRegUsuaModifica(BigDecimal regUsuaModifica){
		this.regUsuaModifica=regUsuaModifica;
	}
	public BigDecimal getRegUsuaModifica(){
		return this.regUsuaModifica;
	}
	@Override
	public String toString(){
		 return "VoPerfil[perfilCodPerfil="+perfilCodPerfil
		 +",perfilBooCodVigente="+perfilBooCodVigente
		 +",perfilDescripcion="+perfilDescripcion
		 +",perfilIcono="+perfilIcono
		 +",perfilIdentificadorJaas="+perfilIdentificadorJaas
		 +",perfilNombre="+perfilNombre
		 +",regUsuaCrea="+regUsuaCrea
		 +",regUsuaModifica="+regUsuaModifica+"]";
	}

}
