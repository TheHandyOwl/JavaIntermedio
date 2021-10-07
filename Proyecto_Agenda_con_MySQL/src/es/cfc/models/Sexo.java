package es.cfc.models;

public enum Sexo {

	H("hombre"), M("mujer");

	private String tipo;

	private Sexo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
