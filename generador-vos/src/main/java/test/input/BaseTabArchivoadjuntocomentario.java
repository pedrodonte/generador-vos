package test.input;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the base_tab_archivoadjuntocomentario database table.
 * 
 */
public class BaseTabArchivoadjuntocomentario implements Serializable {
	private static final long serialVersionUID = 1L;

	private long archivoadjuntocomentarioCod;
	private Timestamp fechaAdjunto;
	private BaseTabArchivoadjunto baseTabArchivoadjunto;
	private BaseTabComentario baseTabComentario;

	public BaseTabArchivoadjuntocomentario() {
	}

	public long getArchivoadjuntocomentarioCod() {
		return this.archivoadjuntocomentarioCod;
	}

	public void setArchivoadjuntocomentarioCod(long archivoadjuntocomentarioCod) {
		this.archivoadjuntocomentarioCod = archivoadjuntocomentarioCod;
	}

	public Timestamp getFechaAdjunto() {
		return this.fechaAdjunto;
	}

	public void setFechaAdjunto(Timestamp fechaAdjunto) {
		this.fechaAdjunto = fechaAdjunto;
	}

	public BaseTabArchivoadjunto getBaseTabArchivoadjunto() {
		return this.baseTabArchivoadjunto;
	}

	public void setBaseTabArchivoadjunto(BaseTabArchivoadjunto baseTabArchivoadjunto) {
		this.baseTabArchivoadjunto = baseTabArchivoadjunto;
	}

	public BaseTabComentario getBaseTabComentario() {
		return this.baseTabComentario;
	}

	public void setBaseTabComentario(BaseTabComentario baseTabComentario) {
		this.baseTabComentario = baseTabComentario;
	}

}