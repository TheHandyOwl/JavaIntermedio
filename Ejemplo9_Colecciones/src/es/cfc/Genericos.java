package es.cfc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Genericos {

	public static void main(String[] args) {

		Set<String> nombres = new HashSet<String>();
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Antonio");
		System.out.println("nombres: " + nombres);

		List<String> frutas = new ArrayList<String>();
		frutas.add("Pera");
		frutas.add("Uvas");
		frutas.add("Platano");
		frutas.add("Manzana");
		System.out.println("frutas: " + frutas);

		// No podemos utilizar tipos primitivos como genericos
		Map<String, Double> notas = new HashMap<>();
		notas.put("Ingles", 5.45);
		notas.put("Matematicas", 8.3);
		notas.put("Lengua", 5.75);
		notas.put("Biologia", 3.8);
		System.out.println("notas: " + notas);
	}

}
