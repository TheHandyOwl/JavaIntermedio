package es.cfc.models;

public class Tren extends Vehiculo{
	
	private int vagones;
	private String origen;
	private String destino;
	
	
	public Tren() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Tren(int capacidad, String marca, String modelo, int vagones, String origen, String destino) {
		super(capacidad, marca, modelo);
		this.vagones = vagones;
		this.origen = origen;
		this.destino = destino;
	}
	
	
	public int getVagones() {
		return vagones;
	}
	public void setVagones(int vagones) {
		this.vagones = vagones;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "vagones=" + vagones + ", origen=" + origen + ", destino=" + destino;
	}
	
}
