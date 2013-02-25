package test.input;
import java.io.Serializable;


/**
 * The persistent class for the base_tab_comentario database table.
 * 
 */
public class BaseTabComentario implements Serializable {
	private static final long serialVersionUID = 1L;
	private long comentarioCod;

	private Boolean concluyente;

	private String texto;

	public BaseTabComentario() {
	}

	public long getComentarioCod() {
		return this.comentarioCod;
	}

	public void setComentarioCod(long comentarioCod) {
		this.comentarioCod = comentarioCod;
	}

	public Boolean getConcluyente() {
		return this.concluyente;
	}

	public void setConcluyente(Boolean concluyente) {
		this.concluyente = concluyente;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}