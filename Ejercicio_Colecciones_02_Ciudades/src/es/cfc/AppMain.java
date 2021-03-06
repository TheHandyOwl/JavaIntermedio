package es.cfc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppMain {

	/*
	 * EJERCICIO 2 Cree un objeto de la clase ArrayList, añada una lista de cadenas
	 * y utilice un iterador para imprimir las cadenas.
	 */

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		lista.add("Madrid");
		lista.add("Barcelona");
		lista.add("San Sebastián");
		lista.add("Jaen");

		System.out.println("lista: " + lista);
		for (String item : lista) {
			System.out.println(item.toUpperCase());
		}
		
		Iterator<String> iterador = lista.iterator();
		// mientras que haya un siguiente elemento
		while(iterador.hasNext()) {
			// Avanzamos el iterador y recogemos el elemento
			String ciudad = iterador.next();
			System.out.println(ciudad.toLowerCase());
		}

	}

}
