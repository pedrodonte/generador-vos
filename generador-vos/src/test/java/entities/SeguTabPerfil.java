package entities;

import java.io.Serializable;
import java.math.BigDecimal;


public class SeguTabPerfil implements Serializable {

	private static final long serialVersionUID = 1L;

	private long perfilCodPerfil;
	private Boolean perfilBooCodVigente;
	private String perfilDescripcion;
	private String perfilIcono;
	private String perfilIdentificadorJaas;
	private String perfilNombre;
	private BigDecimal regUsuaCrea;
	private BigDecimal regUsuaModifica;

	public SeguTabPerfil() {
	}

	public long getPerfilCodPerfil() {
		return this.perfilCodPerfil;
	}

	public void setPerfilCodPerfil(long perfilCodPerfil) {
		this.perfilCodPerfil = perfilCodPerfil;
	}

	public Boolean getPerfilBooCodVigente() {
		return this.perfilBooCodVigente;
	}

	public void setPerfilBooCodVigente(Boolean perfilBooCodVigente) {
		this.perfilBooCodVigente = perfilBooCodVigente;
	}

	public String getPerfilDescripcion() {
		return this.perfilDescripcion;
	}

	public void setPerfilDescripcion(String perfilDescripcion) {
		this.perfilDescripcion = perfilDescripcion;
	}

	public String getPerfilIcono() {
		return this.perfilIcono;
	}

	public void setPerfilIcono(String perfilIcono) {
		this.perfilIcono = perfilIcono;
	}

	public String getPerfilIdentificadorJaas() {
		return this.perfilIdentificadorJaas;
	}

	public void setPerfilIdentificadorJaas(String perfilIdentificadorJaas) {
		this.perfilIdentificadorJaas = perfilIdentificadorJaas;
	}

	public String getPerfilNombre() {
		return this.perfilNombre;
	}

	public void setPerfilNombre(String perfilNombre) {
		this.perfilNombre = perfilNombre;
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

}