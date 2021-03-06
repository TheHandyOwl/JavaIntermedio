package es.cfc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cfc.models.Palabra;

public class AppMain {

	public static void main(String[] args) {

		Palabra hoja = new Palabra();
		hoja.setPalabra("hoja");

		List<String> hojaDefiniciones = new ArrayList<String>();
		hojaDefiniciones.add("1. Hoja de árbol");
		hojaDefiniciones.add("2. Hoja de una navaja");
		hojaDefiniciones.add("3. Hoja de un libro");

		hoja.setDefiniciones(hojaDefiniciones);

		Palabra planta = new Palabra();
		planta.setPalabra("planta");

		List<String> plantaDefiniciones = new ArrayList<String>();
		plantaDefiniciones.add("1. Planta de un edificio");
		plantaDefiniciones.add("2. Planta del pié");
		plantaDefiniciones.add("3. Planta como ser vivo");
		plantaDefiniciones.add("4. Planta de semblante");

		planta.setDefiniciones(plantaDefiniciones);

		Map<String, Palabra> diccionario = new HashMap<>();
		diccionario.put("hoja", hoja);
		diccionario.put("planta", planta);

		System.out.println("Hoja: " + diccionario.get("hoja"));
		System.out.println("Planta: " + diccionario.get("planta"));

	}

}
