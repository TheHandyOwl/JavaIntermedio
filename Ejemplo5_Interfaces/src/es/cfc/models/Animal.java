package es.cfc.models;

public class Animal {

	private String nombre;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre;
	}

}
