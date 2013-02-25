package test.input;

import java.io.Serializable;


/**
 * The persistent class for the base_tab_grupotrabajo database table.
 * 
 */
public class BaseTabGrupotrabajo implements Serializable {
	private static final long serialVersionUID = 1L;

	private long grupotrabajoCod;

	private String descripcion;

	private String nombre;

	public BaseTabGrupotrabajo() {
	}

	public long getGrupotrabajoCod() {
		return this.grupotrabajoCod;
	}

	public void setGrupotrabajoCod(long grupotrabajoCod) {
		this.grupotrabajoCod = grupotrabajoCod;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}