package result;


/* CLASE - AUTOGENERADA
 * FECHA CREACION: Tue Nov 27 16:48:54 CLST 2012 */
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

public class VoUsua implements Serializable{

	private static final long serialVersionUID = 1354045734805L;
	private long usuaCodUsua;
	private BigDecimal regUsuaCrea;
	private BigDecimal regUsuaModifica;
	private String usuaApellidos;
	private Boolean usuaBooCodBloqueado;
	private BigDecimal usuaCantIntentos;
	private String usuaContrasena;
	private String usuaDscDv;
	private String usuaEmail;
	private Timestamp usuaFecCreacion;
	private Date usuaFecFinVigencia;
	private Date usuaFecIniVigencia;
	private Timestamp usuaFecModificacion;
	private String usuaNombres;
	private BigDecimal usuaNumRun;
	private VoPerfil voPerfil;

	public VoUsua(){
	}
	public void setUsuaCodUsua(long usuaCodUsua){
		this.usuaCodUsua=usuaCodUsua;
	}
	public long getUsuaCodUsua(){
		return this.usuaCodUsua;
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
	public void setUsuaApellidos(String usuaApellidos){
		this.usuaApellidos=usuaApellidos;
	}
	public String getUsuaApellidos(){
		return this.usuaApellidos;
	}
	public void setUsuaBooCodBloqueado(Boolean usuaBooCodBloqueado){
		this.usuaBooCodBloqueado=usuaBooCodBloqueado;
	}
	public Boolean getUsuaBooCodBloqueado(){
		return this.usuaBooCodBloqueado;
	}
	public void setUsuaCantIntentos(BigDecimal usuaCantIntentos){
		this.usuaCantIntentos=usuaCantIntentos;
	}
	public BigDecimal getUsuaCantIntentos(){
		return this.usuaCantIntentos;
	}
	public void setUsuaContrasena(String usuaContrasena){
		this.usuaContrasena=usuaContrasena;
	}
	public String getUsuaContrasena(){
		return this.usuaContrasena;
	}
	public void setUsuaDscDv(String usuaDscDv){
		this.usuaDscDv=usuaDscDv;
	}
	public String getUsuaDscDv(){
		return this.usuaDscDv;
	}
	public void setUsuaEmail(String usuaEmail){
		this.usuaEmail=usuaEmail;
	}
	public String getUsuaEmail(){
		return this.usuaEmail;
	}
	public void setUsuaFecCreacion(Timestamp usuaFecCreacion){
		this.usuaFecCreacion=usuaFecCreacion;
	}
	public Timestamp getUsuaFecCreacion(){
		return this.usuaFecCreacion;
	}
	public void setUsuaFecFinVigencia(Date usuaFecFinVigencia){
		this.usuaFecFinVigencia=usuaFecFinVigencia;
	}
	public Date getUsuaFecFinVigencia(){
		return this.usuaFecFinVigencia;
	}
	public void setUsuaFecIniVigencia(Date usuaFecIniVigencia){
		this.usuaFecIniVigencia=usuaFecIniVigencia;
	}
	public Date getUsuaFecIniVigencia(){
		return this.usuaFecIniVigencia;
	}
	public void setUsuaFecModificacion(Timestamp usuaFecModificacion){
		this.usuaFecModificacion=usuaFecModificacion;
	}
	public Timestamp getUsuaFecModificacion(){
		return this.usuaFecModificacion;
	}
	public void setUsuaNombres(String usuaNombres){
		this.usuaNombres=usuaNombres;
	}
	public String getUsuaNombres(){
		return this.usuaNombres;
	}
	public void setUsuaNumRun(BigDecimal usuaNumRun){
		this.usuaNumRun=usuaNumRun;
	}
	public BigDecimal getUsuaNumRun(){
		return this.usuaNumRun;
	}
	public void setVoPerfil(VoPerfil voPerfil){
		this.voPerfil=voPerfil;
	}
	public VoPerfil getVoPerfil(){
		return this.voPerfil;
	}
	@Override
	public String toString(){
		 return "VoUsua[usuaCodUsua="+usuaCodUsua
		 +",regUsuaCrea="+regUsuaCrea
		 +",regUsuaModifica="+regUsuaModifica
		 +",usuaApellidos="+usuaApellidos
		 +",usuaBooCodBloqueado="+usuaBooCodBloqueado
		 +",usuaCantIntentos="+usuaCantIntentos
		 +",usuaContrasena="+usuaContrasena
		 +",usuaDscDv="+usuaDscDv
		 +",usuaEmail="+usuaEmail
		 +",usuaFecCreacion="+usuaFecCreacion
		 +",usuaFecFinVigencia="+usuaFecFinVigencia
		 +",usuaFecIniVigencia="+usuaFecIniVigencia
		 +",usuaFecModificacion="+usuaFecModificacion
		 +",usuaNombres="+usuaNombres
		 +",usuaNumRun="+usuaNumRun
		 +",voPerfil="+voPerfil+"]";
	}

}
