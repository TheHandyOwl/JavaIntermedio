package es.cfc.models;

// Una clase encapsulada tiene todas sus propiedades como privadas
// y se accede a ellas a traves de los metodos get y set publicos
public class Contacto {

	// propiedades o caracteristicas que definen un contacto
	private int ID;
	private String nombre;
	private long telefono;
	private Sexo sexo;

	// Recurso de clase
	private static int contador = 0;
	
	// Un constructor es una especie de metodo que se invoca para
	// crear el objeto
	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	public Contacto(String nombre, long telefono, Sexo sexo) {
		super();
		ID = ++contador;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		System.out.println(
				"ID:" + ID + "-" +
				"nombre:" + nombre + "-" +
				"telefono:" + telefono + "-" +
				"sexo:" + sexo + "-"
				);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (int) (telefono ^ (telefono >>> 32));
		return result;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", nombre=" + nombre + ", telefono=" + telefono +
				", sexo=" + sexo.getTipo() + "(" + sexo + ")" + ", hashCode=" + hashCode();
	}

}
