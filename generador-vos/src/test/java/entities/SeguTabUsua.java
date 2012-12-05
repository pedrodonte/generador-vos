package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the segu_tab_usua database table.
 * 
 */
public class SeguTabUsua implements Serializable {

	private static final long serialVersionUID = 1L;

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
	private SeguTabPerfil seguTabPerfil;

	public SeguTabUsua() {
	}

	public long getUsuaCodUsua() {
		return this.usuaCodUsua;
	}

	public void setUsuaCodUsua(long usuaCodUsua) {
		this.usuaCodUsua = usuaCodUsua;
	}

	public BigDecimal getRegUsuaCrea() {
		return this.regUsuaCrea;
	}

	public void setRegUsuaCrea(BigDecimal regUsuaCrea) {
		this.regUsuaCrea = regUsuaCrea;
	}

	public BigDecimal getRegUsuaModifica() {
		return this.regUsuaModifica;
	}

	public void setRegUsuaModifica(BigDecimal regUsuaModifica) {
		this.regUsuaModifica = regUsuaModifica;
	}

	public String getUsuaApellidos() {
		return this.usuaApellidos;
	}

	public void setUsuaApellidos(String usuaApellidos) {
		this.usuaApellidos = usuaApellidos;
	}

	public Boolean getUsuaBooCodBloqueado() {
		return this.usuaBooCodBloqueado;
	}

	public void setUsuaBooCodBloqueado(Boolean usuaBooCodBloqueado) {
		this.usuaBooCodBloqueado = usuaBooCodBloqueado;
	}

	public BigDecimal getUsuaCantIntentos() {
		return this.usuaCantIntentos;
	}

	public void setUsuaCantIntentos(BigDecimal usuaCantIntentos) {
		this.usuaCantIntentos = usuaCantIntentos;
	}

	public String getUsuaContrasena() {
		return this.usuaContrasena;
	}

	public void setUsuaContrasena(String usuaContrasena) {
		this.usuaContrasena = usuaContrasena;
	}

	public String getUsuaDscDv() {
		return this.usuaDscDv;
	}

	public void setUsuaDscDv(String usuaDscDv) {
		this.usuaDscDv = usuaDscDv;
	}

	public String getUsuaEmail() {
		return this.usuaEmail;
	}

	public void setUsuaEmail(String usuaEmail) {
		this.usuaEmail = usuaEmail;
	}

	public Timestamp getUsuaFecCreacion() {
		return this.usuaFecCreacion;
	}

	public void setUsuaFecCreacion(Timestamp usuaFecCreacion) {
		this.usuaFecCreacion = usuaFecCreacion;
	}

	public Date getUsuaFecFinVigencia() {
		return this.usuaFecFinVigencia;
	}

	public void setUsuaFecFinVigencia(Date usuaFecFinVigencia) {
		this.usuaFecFinVigencia = usuaFecFinVigencia;
	}

	public Date getUsuaFecIniVigencia() {
		return this.usuaFecIniVigencia;
	}

	public void setUsuaFecIniVigencia(Date usuaFecIniVigencia) {
		this.usuaFecIniVigencia = usuaFecIniVigencia;
	}

	public Timestamp getUsuaFecModificacion() {
		return this.usuaFecModificacion;
	}

	public void setUsuaFecModificacion(Timestamp usuaFecModificacion) {
		this.usuaFecModificacion = usuaFecModificacion;
	}

	public String getUsuaNombres() {
		return this.usuaNombres;
	}

	public void setUsuaNombres(String usuaNombres) {
		this.usuaNombres = usuaNombres;
	}

	public BigDecimal getUsuaNumRun() {
		return this.usuaNumRun;
	}

	public void setUsuaNumRun(BigDecimal usuaNumRun) {
		this.usuaNumRun = usuaNumRun;
	}

	public SeguTabPerfil getSeguTabPerfil() {
		return this.seguTabPerfil;
	}

	public void setSeguTabPerfil(SeguTabPerfil seguTabPerfil) {
		this.seguTabPerfil = seguTabPerfil;
	}

}