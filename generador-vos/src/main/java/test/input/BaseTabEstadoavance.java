package test.input;
import java.io.Serializable;


/**
 * The persistent class for the base_tab_estadoavance database table.
 * 
 */
public class BaseTabEstadoavance implements Serializable {
	private static final long serialVersionUID = 1L;
	private long estadoavanceCod;

	private String descripcion;

	private String glosa;

	public BaseTabEstadoavance() {
	}

	public long getEstadoavanceCod() {
		return this.estadoavanceCod;
	}

	public void setEstadoavanceCod(long estadoavanceCod) {
		this.estadoavanceCod = estadoavanceCod;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGlosa() {
		return this.glosa;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}

}