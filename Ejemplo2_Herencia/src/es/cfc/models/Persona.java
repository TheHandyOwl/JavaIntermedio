package es.cfc.models;

// public class Persona extends Object{
public class Persona {
	
	private String nombre;
	private int edad;
	private char sexo;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad, char sexo) {
		// Llama al constructor por defecto de la clase Object
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + " edad=" + edad + " sexo=" + sexo ;
	}	

}
