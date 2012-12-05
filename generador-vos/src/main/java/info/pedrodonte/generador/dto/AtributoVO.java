package info.pedrodonte.generador.dto;

public class AtributoVO {

	private String nombreAtributoVO;
	private String tipoAtributoVO;

	private String nombreAtributoEnti;
	private String tipoAtributoEnti;

	private String nombrePackageType;

	private boolean isEntidadNegocio = false;

	public AtributoVO() {
	}

	public String getGeter() {
		StringBuilder sb = new StringBuilder();
		sb.append("public " + tipoAtributoVO + " get"+ getNombreCamelTipo(nombreAtributoVO) + "(){\n");
		sb.append("\t\treturn this." + nombreAtributoVO + ";\n");
		sb.append("\t}");
		return sb.toString();
	}

	public String getGeterNombreVO() {
		StringBuilder sb = new StringBuilder();
		sb.append("get" + getNombreCamelTipo(nombreAtributoVO) + "()");
		return sb.toString();
	}

	public String getGeterNombreEntity() {
		StringBuilder sb = new StringBuilder();
		sb.append("get" + getNombreCamelTipo(nombreAtributoEnti) + "()");
		return sb.toString();
	}

	public String getNombreCamelTipo(String nombreAtributoVO) {
		return nombreAtributoVO.substring(0, 1).toUpperCase()
				+ nombreAtributoVO.substring(1);
	}

	public String getSeterNombreVO() {
		StringBuilder sb = new StringBuilder();
		sb.append("set" + getNombreCamelTipo(nombreAtributoVO));
		return sb.toString();
	}

	public String getSeterNombreEntity() {
		StringBuilder sb = new StringBuilder();
		sb.append("set" + getNombreCamelTipo(nombreAtributoEnti));
		return sb.toString();
	}

	public String getSeter() {
		StringBuilder sb = new StringBuilder();
		sb.append("public void set" + getNombreCamelTipo(nombreAtributoVO)+ "(" + tipoAtributoVO + " " + nombreAtributoVO + "){\n");
		sb.append("\t\tthis." + nombreAtributoVO + "=" + nombreAtributoVO+ ";\n");
		sb.append("\t}");
		return sb.toString();
	}

	public String getNombreAtributoVO() {
		return nombreAtributoVO;
	}

	public void setNombreAtributoVO(String nombreAtributoVO) {
		this.nombreAtributoVO = nombreAtributoVO;
	}

	public String getTipoAtributoVO() {
		return tipoAtributoVO;
	}

	public void setTipoAtributoVO(String tipoAtributoVO) {
		this.tipoAtributoVO = tipoAtributoVO;
	}

	public String getNombreAtributoEnti() {
		return nombreAtributoEnti;
	}

	public void setNombreAtributoEnti(String nombreAtributoEnti) {
		this.nombreAtributoEnti = nombreAtributoEnti;
	}

	public String getTipoAtributoEnti() {
		return tipoAtributoEnti;
	}

	public void setTipoAtributoEnti(String tipoAtributoEnti) {
		this.tipoAtributoEnti = tipoAtributoEnti;
	}

	public boolean isEntidadNegocio() {
		return isEntidadNegocio;
	}

	public void setEntidadNegocio(boolean isEntidadNegocio) {
		this.isEntidadNegocio = isEntidadNegocio;
	}

	public void setTipoAtributoEntiPaquete(String nombrePackageType) {
		this.setNombrePackageType(nombrePackageType);
	}

	public String getNombrePackageType() {
		return nombrePackageType;
	}

	public void setNombrePackageType(String nombrePackageType) {
		this.nombrePackageType = nombrePackageType;
	}

	@Override
	public String toString() {
		return "AtributoVO [nombreAtributoVO=" + nombreAtributoVO
				+ ", tipoAtributoVO=" + tipoAtributoVO
				+ ", nombreAtributoEnti=" + nombreAtributoEnti
				+ ", tipoAtributoEnti=" + tipoAtributoEnti
				+ ", nombrePackageType=" + nombrePackageType
				+ ", isEntidadNegocio=" + isEntidadNegocio + "]";
	}
	
	

}
