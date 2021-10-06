package es.cfc.models;

import es.cfc.models.interfaces.Sonidos;

public class Pajaro extends Animal implements Sonidos {

	private String sonido;

	public Pajaro() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Pajaro(int year, String habitat, String nombre, boolean domestico, String sonido) {
		super(year, habitat, nombre, domestico);
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El pajaro dice " + sonido);
	}

	@Override
	public String toString() {
		return super.toString() + ", sonido='" + sonido + "'";
	}

}
