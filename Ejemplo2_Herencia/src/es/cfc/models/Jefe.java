package es.cfc.models;

public class Jefe extends Empleado{
	
	private double bonus;
	
	public Jefe() {
		// TODO Auto-generated constructor stub
	}

	public Jefe(String nombre, int edad, char sexo, double sueldo, double bonus) {
		super(nombre, edad, sexo, sueldo);
		this.bonus = bonus;	
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " bonus=" + bonus;
	}
	
	

}
