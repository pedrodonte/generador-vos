package test.input;

import java.io.Serializable;
import java.sql.Timestamp;
public class BaseTabHistoriaestadoavance implements Serializable {
	private static final long serialVersionUID = 1L;
	private long historiaestadoavanceCod;
	private Boolean esHistoria;
	private Timestamp fechaEstado;
	private BaseTabActividad baseTabActividad;
	private BaseTabEstadoavance baseTabEstadoavance;

	public BaseTabHistoriaestadoavance() {
	}

	public long getHistoriaestadoavanceCod() {
		return this.historiaestadoavanceCod;
	}

	public void setHistoriaestadoavanceCod(long historiaestadoavanceCod) {
		this.historiaestadoavanceCod = historiaestadoavanceCod;
	}

	public Boolean getEsHistoria() {
		return this.esHistoria;
	}

	public void setEsHistoria(Boolean esHistoria) {
		this.esHistoria = esHistoria;
	}

	public Timestamp getFechaEstado() {
		return this.fechaEstado;
	}

	public void setFechaEstado(Timestamp fechaEstado) {
		this.fechaEstado = fechaEstado;
	}

	public BaseTabActividad getBaseTabActividad() {
		return this.baseTabActividad;
	}

	public void setBaseTabActividad(BaseTabActividad baseTabActividad) {
		this.baseTabActividad = baseTabActividad;
	}

	public BaseTabEstadoavance getBaseTabEstadoavance() {
		return this.baseTabEstadoavance;
	}

	public void setBaseTabEstadoavance(BaseTabEstadoavance baseTabEstadoavance) {
		this.baseTabEstadoavance = baseTabEstadoavance;
	}

}