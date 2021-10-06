package es.cfc;

import es.cfc.models.Persona;

public class AppMain {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan");
		System.out.println(persona1);
		Persona persona2 = new Persona("Paco");
		System.out.println(persona2);

		// Acceso a los recursos de instancia
		// instancia.recurso
		System.out.println(persona2.getNombre()); // Se permite
		System.out.println(persona2.getNombre()); // Se permite
		
		// Acceso a los recursos static o de clase
		// Clase.recurso
		System.out.println(Persona.getContador()); // Mejor así

	}

}
