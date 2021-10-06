package es.cfc.models;

public enum Numero {

	UNO("uno"), DOS("dos"), TRES("tres"), CUATRO("cuatro"), CINCO("cinco"), SEIS("seis"), SIETE("siete"), SOTA("sota"),
	CABALLO("caballo"), REY("rey");

	private String numero;

	private Numero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
