package es.cfc;

import es.cfc.models.EstadoCivil;
import es.cfc.models.Persona;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EstadoCivil estado = EstadoCivil.CASADO;
		System.out.println("Estado: " + estado);
		
		Persona jorge = new Persona("Jorge", 28, estado.SOLTERO);
		System.out.println(jorge);
		
		Persona marta = new Persona("Marta", 24, estado.PAREJA_HECHO);
		System.out.println(marta);
		
		Persona natalia = new Persona("Natalia", 39, estado.DIVORCIADO);
		System.out.println(natalia);
		
		Persona juan = new Persona("Juan", 78, estado.CASADO);
		System.out.println(juan);
	}

}
