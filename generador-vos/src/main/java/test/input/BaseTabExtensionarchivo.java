package test.input;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the base_tab_extensionarchivo database table.
 * 
 */
public class BaseTabExtensionarchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	private long extensionarchivoCod;

	private String baseTabExtensionarchivo;

	private BigDecimal typemime;

	public BaseTabExtensionarchivo() {
	}

	public long getExtensionarchivoCod() {
		return this.extensionarchivoCod;
	}

	public void setExtensionarchivoCod(long extensionarchivoCod) {
		this.extensionarchivoCod = extensionarchivoCod;
	}

	public String getBaseTabExtensionarchivo() {
		return this.baseTabExtensionarchivo;
	}

	public void setBaseTabExtensionarchivo(String baseTabExtensionarchivo) {
		this.baseTabExtensionarchivo = baseTabExtensionarchivo;
	}

	public BigDecimal getTypemime() {
		return this.typemime;
	}

	public void setTypemime(BigDecimal typemime) {
		this.typemime = typemime;
	}

}