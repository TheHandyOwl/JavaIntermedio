package es.cfc.models;

public enum Estado {

	NUEVA("nueva"), EN_PROCESO("en proceso"), FINALIZADA("finalizada");

	private String estado;

	private Estado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

}
