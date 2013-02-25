package test.input;

import java.io.Serializable;

public class BaseTabMiembrogrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	private long miembrogrupoCod;

	private String email;

	private String nombre;

	public BaseTabMiembrogrupo() {
	}

	public long getMiembrogrupoCod() {
		return this.miembrogrupoCod;
	}

	public void setMiembrogrupoCod(long miembrogrupoCod) {
		this.miembrogrupoCod = miembrogrupoCod;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}