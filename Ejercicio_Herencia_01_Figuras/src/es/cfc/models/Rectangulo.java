package es.cfc.models;

public class Rectangulo extends Figura{
	
	private double ancho;
	private double alto;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(int coordenadaX, int coordenadaY, double ancho, double alto) {
		super(coordenadaX, coordenadaY);
		this.ancho = ancho;
		this.alto = alto;
	}
	

	@Override
	public String posicion() {
		// TODO Auto-generated method stub
		return super.posicion() + " Ancho: " + ancho + " Alto: " + alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	

}
