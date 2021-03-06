package es.cfc.models;

// Una clase encapsulada tiene todas sus propiedades como privadas
// y se accede a ellas a traves de los metodos get y set publicos
public class Contacto {

	// propiedades o caracteristicas que definen un contacto
	private int ID = 1;
	private String nombre;
	private long telefono;
	private char sexo;
	
	// Un constructor es una especie de metodo que se invoca para
	// crear el objeto
	public Contacto() {
		// TODO Auto-generated constructor stub
	}
	
	public Contacto(int iD, String nombre, long telefono, char sexo) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
	}


	// metodo de lectura para el ID
	public int getID() {
		return ID;
	}

	// metodo de escritura para el ID
	public void setID(int iD) {
		ID = iD;
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

	
	@Override
	public String toString() {
		return "Contacto [ID=" + ID + ", nombre=" + nombre + 
				", telefono=" + telefono + ", sexo=" + sexo + "]";
	}
	
	
	

}
