package es.cfc.models;

public class Pajaro extends Animal implements Volador {

	private boolean domestico;

	public Pajaro() {
		// TODO Auto-generated constructor stub
	}

	public Pajaro(String nombre, boolean domestico) {
		super(nombre);
		this.domestico = domestico;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Volando voy");
	}

	@Override
	public String toString() {
		return super.toString() + ", domestico=" + domestico;
	}

}
