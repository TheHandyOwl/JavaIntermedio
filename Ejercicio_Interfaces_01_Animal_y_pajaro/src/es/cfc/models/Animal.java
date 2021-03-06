package es.cfc.models;

public class Animal extends SerVivo {

	private String nombre;
	private boolean domestico;

	public Animal() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Animal(int year, String habitat, String nombre, boolean domestico) {
		super(year, habitat);
		this.nombre = nombre;
		this.domestico = domestico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	@Override
	public String toString() {
		return super.toString() + ", nombre=" + nombre + ", domestico=" + domestico;
	}

}
