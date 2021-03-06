package es.cfc.models;

public class Figura {

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
