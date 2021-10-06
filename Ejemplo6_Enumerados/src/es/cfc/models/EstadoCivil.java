package es.cfc.models;

public enum EstadoCivil {

	SOLTERO("soltero", 'S'), CASADO("casado", 'C'), VIUDO("viudo", 'V'), DIVORCIADO("divorciado", 'D'),
	PAREJA_HECHO("pareja de hecho", 'P');

	private String estado;
	private char letra;

	private EstadoCivil(String estado, char letra) {
		this.estado = estado;
		this.letra = letra;
	}

	public String getEstado() {
		return estado;
	}

	public char getLetra() {
		return letra;
	}

}
