package test.input;

import java.io.Serializable;


/**
 * The persistent class for the base_tab_miembroresponsableactividad database table.
 * 
 */
public class BaseTabMiembroresponsableactividad implements Serializable {
	private static final long serialVersionUID = 1L;

	private long miembroresponsableactividadCod;

	//uni-directional many-to-one association to BaseTabActividad
	private BaseTabActividad baseTabActividad;

	private BaseTabMiembrogrupo baseTabMiembrogrupo;

	public BaseTabMiembroresponsableactividad() {
	}

	public long getMiembroresponsableactividadCod() {
		return this.miembroresponsableactividadCod;
	}

	public void setMiembroresponsableactividadCod(long miembroresponsableactividadCod) {
		this.miembroresponsableactividadCod = miembroresponsableactividadCod;
	}

	public BaseTabActividad getBaseTabActividad() {
		return this.baseTabActividad;
	}

	public void setBaseTabActividad(BaseTabActividad baseTabActividad) {
		this.baseTabActividad = baseTabActividad;
	}

	public BaseTabMiembrogrupo getBaseTabMiembrogrupo() {
		return this.baseTabMiembrogrupo;
	}

	public void setBaseTabMiembrogrupo(BaseTabMiembrogrupo baseTabMiembrogrupo) {
		this.baseTabMiembrogrupo = baseTabMiembrogrupo;
	}

}