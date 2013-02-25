package test.input;

import java.io.Serializable;
import java.sql.Timestamp;

public class BaseTabMembresia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long membresiaCod;
	private Timestamp fechaMembresia;

	private Boolean vigente;
	private BaseTabGrupotrabajo baseTabGrupotrabajo;
	private BaseTabMiembrogrupo baseTabMiembrogrupo;

	public BaseTabMembresia() {
	}

	public long getMembresiaCod() {
		return this.membresiaCod;
	}

	public void setMembresiaCod(long membresiaCod) {
		this.membresiaCod = membresiaCod;
	}

	public Timestamp getFechaMembresia() {
		return this.fechaMembresia;
	}

	public void setFechaMembresia(Timestamp fechaMembresia) {
		this.fechaMembresia = fechaMembresia;
	}

	public Boolean getVigente() {
		return this.vigente;
	}

	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}

	public BaseTabGrupotrabajo getBaseTabGrupotrabajo() {
		return this.baseTabGrupotrabajo;
	}

	public void setBaseTabGrupotrabajo(BaseTabGrupotrabajo baseTabGrupotrabajo) {
		this.baseTabGrupotrabajo = baseTabGrupotrabajo;
	}

	public BaseTabMiembrogrupo getBaseTabMiembrogrupo() {
		return this.baseTabMiembrogrupo;
	}

	public void setBaseTabMiembrogrupo(BaseTabMiembrogrupo baseTabMiembrogrupo) {
		this.baseTabMiembrogrupo = baseTabMiembrogrupo;
	}

}