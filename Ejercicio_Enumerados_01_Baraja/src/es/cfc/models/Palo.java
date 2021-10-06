package es.cfc.models;

public enum Palo {

	OROS("oros"), COPAS("copas"), ESPADAS("espadas"), BASTOS("bastos");
	
	private String palo;
	
	private Palo(String palo) {
		this.palo = palo;
	}

	public String getPalo() {
		return palo;
	}
	
}
