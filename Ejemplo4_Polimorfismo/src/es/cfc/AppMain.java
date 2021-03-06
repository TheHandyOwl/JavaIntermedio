package es.cfc;

import es.cfc.models.Empleado;
import es.cfc.models.Jefe;
import es.cfc.models.Persona;

public class AppMain {

	public static void main(String[] args) {
		
		Jefe jefe = new Jefe("Antonio", 26, 'H', 50000, 10000);
		System.out.println(jefe);
		System.out.println(jefe.getBonus());
		
		// Polimorfismo
		Persona persona = new Jefe("Antonio", 26, 'H', 50000, 10000);
		System.out.println(persona);
		//System.out.println(persona.getBonus()); // No podemos acceder a los recursos de Jefe
		System.out.println(persona.getNombre()); // Solo vemos los recursos declarados en Persona

		// El polimorfismo se trata de ver el mismo objeto de diferentes formas
		// Un objeto Jefe, lo puedo ver como: Empleado, Persona y Object.
		// El tipo de la variable es quien limita cómo se está viendo.
		
		// Entonces... ¿cómo se cambia la visibilidad? Tras declarar el objeto, como hacemos el 'casting' a otro?
		// upcasting o reducir visibilidad no requiere declarar su tipo
		Object objeto = persona;
		//objeto.getClass(); // Sólo ve los métodos de 'Object'
		// downcasting o aumentar visibilidad sí necesita declarar el tipo
		Empleado empleado = (Empleado) persona;
		System.out.println(empleado.getSueldo()); // Ya tenemos casteado el objeto como persona
		Jefe otroJefe = (Jefe) persona;
		System.out.println(otroJefe.getBonus()); // Ya tenemos casteado el objeto como jefe
		
		int num1 = 6;
		int num2 = 6;
		System.out.println("¿Iguales?" + (num1==num2)); // true
		System.out.println("¿Iguales?" + (jefe==otroJefe)); // false
		System.out.println("¿Iguales?" + (jefe.equals(otroJefe))); // true porque mira el equals y el hashCode
		
		if (persona instanceof Jefe) {
			Jefe otroJefeMas = (Jefe) persona;
		}
	}

}
