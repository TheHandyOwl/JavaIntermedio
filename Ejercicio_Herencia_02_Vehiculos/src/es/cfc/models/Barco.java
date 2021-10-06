package es.cfc.models;

public class Barco extends Vehiculo{
	
	private double eslora;
	private String uso;
	
	public Barco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Barco(int capacidad, String marca, String modelo, double eslora, String uso) {
		super(capacidad, marca, modelo);
		this.eslora = eslora;
		this.uso = uso;
	}
	
	
	@Override
	public String girarDerecha() {
		// TODO Auto-generated method stub
		return "Giro a estribor";
	}
	@Override
	public String girarIzquierda() {
		// TODO Auto-generated method stub
		return "Giro a babor";
	}
	
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "eslora=" + eslora + ", uso=" + uso;
	}
	
}
