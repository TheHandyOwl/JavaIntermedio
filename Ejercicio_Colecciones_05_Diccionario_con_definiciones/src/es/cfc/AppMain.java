package es.cfc;

import java.util.HashMap;
import java.util.Map;

import es.cfc.models.Palabra;

public class AppMain {

	/*
	 * EJERCICIO 5 Cree un programa que implemente un diccionario. El diccionario
	 * debe contener palabras en castellano y una lista de posibles significados de
	 * cada palabra. Crear la clase Palabra que permita almacenar la información de
	 * una palabra, junto con sus definiciones. Utilizar un objeto HashMap para
	 * almacenar palabras en la clase Diccionario.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palabra hoja = new Palabra();
		hoja.setSignificado("1. Hoja de árbol");
		hoja.setSignificado("2. Hoja de una navaja");
		hoja.setSignificado("3. Hoja de un libro");
		
		Palabra planta = new Palabra();
		planta.setSignificado("1. Planta de un edificio");
		planta.setSignificado("2. Planta del pié");
		planta.setSignificado("3. Planta como ser vivo");
		planta.setSignificado("4. Planta de semblante");
		
		Map<String, Palabra> diccionario = new HashMap<>();
		diccionario.put("hoja", hoja);
		diccionario.put("planta", planta);
		
		System.out.println("Hoja: " + diccionario.get("hoja"));
		System.out.println("Planta: " + diccionario.get("planta"));

	}

}
