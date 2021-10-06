package es.cfc.models;

// Si declaramos un método abstracto, la clase será también abstracta
public abstract class Figura {

	// propiedades
	private int coordenadaX;
	private int coordenadaY;

	// constructores
	public Figura() {
		// TODO Auto-generated constructor stub
	}

	public Figura(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	// Método abstracto es un método declarado no implementado
	// Si ponemos unas llaves, significará que también lo implementamos
	// Fuerza a que la clase sea también abstracta
	public abstract double calcularArea();
	
	// Resto de métodos
	public String posicion() {
		return "[" + coordenadaX + "," + coordenadaY + "]";
	}

	// metodos de acceso get y set
	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

}
