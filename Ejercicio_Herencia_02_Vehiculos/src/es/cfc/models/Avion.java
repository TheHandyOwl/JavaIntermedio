package es.cfc.models;

public class Avion extends Vehiculo{
	
	private int autonomia;
	private String linea;
	
	
	// Cosntructores
	public Avion() {
		// TODO Auto-generated constructor stub
	}
	public Avion(int capacidad, String marca, String modelo, int autonomia, String linea) {
		super(capacidad, marca, modelo);
		this.autonomia = autonomia;
		this.linea = linea;
	}
	
	
	// Propiedades
	public String repostar() {
		return "Avion repostando";
	}
	@Override
	public String retroceder() {
		// TODO Auto-generated method stub
		return "Avion maniobrando en la terminal";
	}
	//Heredadas
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}

	
	// toString
	@Override
	public String toString() {
		return super.toString() + "autonomia=" + autonomia + ", linea=" + linea;
	}
	
}
