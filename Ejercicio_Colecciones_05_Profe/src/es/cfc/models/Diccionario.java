package es.cfc.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {

	private Map<String, List<String>> palabras = new HashMap<String, List<String>>();

	public void addPalabra(Palabra palabra) {
		palabras.put(palabra.getPalabra(), palabra.getDefiniciones());
	}

	public Map<String, List<String>> getPalabras() {
		return palabras;
	}

}
