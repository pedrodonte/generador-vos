package test.input;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the base_tab_actividad database table.
 * 
 */
public class BaseTabActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	private long actividadCod;
	private String descripcion;
	private Date fechaEntrega;
	private String titulo;
	private BaseTabActividad baseTabActividad;

	public BaseTabActividad() {
	}

	public long getActividadCod() {
		return this.actividadCod;
	}

	public void setActividadCod(long actividadCod) {
		this.actividadCod = actividadCod;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BaseTabActividad getBaseTabActividad() {
		return this.baseTabActividad;
	}

	public void setBaseTabActividad(BaseTabActividad baseTabActividad) {
		this.baseTabActividad = baseTabActividad;
	}

}