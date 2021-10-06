package es.cfc.models;

public class Vehiculo {
	
	private int capacidad;
	private String marca;
	private String modelo;
	
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	

	public Vehiculo(int capacidad, String marca, String modelo) {
		super();
		this.capacidad = capacidad;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	public String avanzar() {
		return "El vehiculo avanza hacia adelante";
	}
	public String retroceder() {
		return "El vehiculo retrocede";
	}
	public String girarIzquierda() {
		return "El vehiculo gira a la izquierda";
	}
	public String girarDerecha() {
		return "El vehiculo gira a la derecha";
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	@Override
	public String toString() {
		return "capacidad=" + capacidad + ", marca=" + marca + ", modelo=" + modelo;
	}
	
}
