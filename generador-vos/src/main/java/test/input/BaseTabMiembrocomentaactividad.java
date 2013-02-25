package test.input;

import java.io.Serializable;
import java.sql.Timestamp;


public class BaseTabMiembrocomentaactividad implements Serializable {
	private static final long serialVersionUID = 1L;

	private long miembrocomentaactividadCod;
	private Timestamp fechaComenta;
	private BaseTabComentario baseTabComentario;
	private BaseTabMiembrogrupo baseTabMiembrogrupo;

	public BaseTabMiembrocomentaactividad() {
	}

	public long getMiembrocomentaactividadCod() {
		return this.miembrocomentaactividadCod;
	}

	public void setMiembrocomentaactividadCod(long miembrocomentaactividadCod) {
		this.miembrocomentaactividadCod = miembrocomentaactividadCod;
	}

	public Timestamp getFechaComenta() {
		return this.fechaComenta;
	}

	public void setFechaComenta(Timestamp fechaComenta) {
		this.fechaComenta = fechaComenta;
	}

	public BaseTabComentario getBaseTabComentario() {
		return this.baseTabComentario;
	}

	public void setBaseTabComentario(BaseTabComentario baseTabComentario) {
		this.baseTabComentario = baseTabComentario;
	}

	public BaseTabMiembrogrupo getBaseTabMiembrogrupo() {
		return this.baseTabMiembrogrupo;
	}

	public void setBaseTabMiembrogrupo(BaseTabMiembrogrupo baseTabMiembrogrupo) {
		this.baseTabMiembrogrupo = baseTabMiembrogrupo;
	}

}