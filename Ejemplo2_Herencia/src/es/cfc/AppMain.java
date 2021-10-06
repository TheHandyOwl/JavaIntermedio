package es.cfc;

import es.cfc.models.Empleado;
import es.cfc.models.Jefe;
import es.cfc.models.Persona;

public class AppMain {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Pepe", 34, 'H');
		Empleado empleado = new Empleado("Marcos", 42, 'H', 35000);
		Jefe jefe = new Jefe("Antonio", 26, 'H', 50000, 10000);
		
		System.out.println(persona);
		System.out.println(empleado);
		System.out.println(jefe);
		
	

	}

}
