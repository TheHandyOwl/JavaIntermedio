package es.cfc.models;

public class Persona {

	private String nombre;
	private int edad;
	private EstadoCivil estado;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad, EstadoCivil estado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado.getEstado() + " '" + estado.getLetra() + "'";
	}

}
