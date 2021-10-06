package es.cfc.models;

// Empleado hereda de Persona todos los recursos que no son private 
// ni los constructores
public class Empleado extends Persona{
	
	private double sueldo;
	
	public Empleado() {
		// Esta linea siempre existe aunque no la veamos
		super();
	}

	public Empleado(String nombre, int edad, char sexo, double sueldo) {
		// se invoca al constructor de la superclase Persona
		super(nombre, edad, sexo);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + " sueldo=" + sueldo + "€"  ;
	}

	

	
}
