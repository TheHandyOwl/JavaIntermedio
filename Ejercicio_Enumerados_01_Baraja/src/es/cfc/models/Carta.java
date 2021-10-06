package es.cfc.models;

public class Carta {

	private Numero numero;
	private Palo palo;
	
	public Carta(Numero numero, Palo palo) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numero + " de " + palo;
	}	
	
}
