package es.cfc.models;

public class Contacto {
	
	// Properties
	private int id;
	private String nombre;
	private long telefono;
	private char sexo;
	
	// Constructors
	public Contacto() {
	}
	
	public Contacto(int id, String nombre, long telefono, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
	}
	
	// Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// Description
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", sexo=" + sexo + "]";
	}
	
}
