package es.cfc;

import java.util.HashSet;
import java.util.Set;

public class AppMain {

	/*
	 * EJERCICIO 1 Cree una clase que tenga un objeto de la clase HashSet, que añada
	 * varias cadenas al objeto e imprima todas las cadenas. Utilizar el tipo
	 * genérico String.
	 */

	public static void main(String[] args) {
		
		Set<String> diaSemana = new HashSet<String>();
		
		diaSemana.add("Lunes");
		diaSemana.add("Martes");
		diaSemana.add("Miércoles");
		diaSemana.add("Jueves");
		diaSemana.add("Viernes");
		diaSemana.add("Sábado");
		diaSemana.add("Domingo");

		System.out.println("diaSemana: " + diaSemana);
		for (String dia : diaSemana) {
			System.out.println(dia.toUpperCase() + "(" + dia.length() + ")");
		}
	}

}
