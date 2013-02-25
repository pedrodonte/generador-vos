package test.input;
import java.io.Serializable;


/**
 * The persistent class for the base_tab_archivoadjunto database table.
 * 
 */
public class BaseTabArchivoadjunto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long archivoadjuntoCod;
	private String descripcion;
	private String nombreArchivo;
	private BaseTabExtensionarchivo baseTabExtensionarchivo;

	public BaseTabArchivoadjunto() {
	}

	public long getArchivoadjuntoCod() {
		return this.archivoadjuntoCod;
	}

	public void setArchivoadjuntoCod(long archivoadjuntoCod) {
		this.archivoadjuntoCod = archivoadjuntoCod;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public BaseTabExtensionarchivo getBaseTabExtensionarchivo() {
		return this.baseTabExtensionarchivo;
	}

	public void setBaseTabExtensionarchivo(BaseTabExtensionarchivo baseTabExtensionarchivo) {
		this.baseTabExtensionarchivo = baseTabExtensionarchivo;
	}

}