package es.cfc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppMain {


	public static void main(String[] args) {

		// LIST SÍ permite duplicados y SÍ garantiza el orden de entrada
		List list = new ArrayList();
		list.add("Hola");
		list.add("Adiós");
		list.add(1);
		list.add(true);
		list.add(2);
		list.add("Hola");
		System.out.println("List: " + list);
		

		for(Object objeto : list){
		    System.out.println("objeto: " + objeto);
		}

		// SET NO permite duplicados y NO garantiza el orden de entrada
		Set set = new HashSet();
		set.add("Hola");
		set.add("Adiós");
		set.add(1);
		set.add(true);
		set.add(2);
		set.add("Hola");
		System.out.println("Set: " + set);

		// MAP los elementos son de tipo key-value
		// Las claves no se pueden repetir, y los valores sí
		// Están desordenados y se accede por la key
		Map mapa = new HashMap();
		mapa.put(1, "Pepito");
		mapa.put("ingles", 8.5);
		mapa.put(true, "Adios");
		mapa.put("ingles", 9.5);
		System.out.println("Mapa: " + mapa);
		
		// keySet -> devuelve otra colección con las claves (key)
		System.out.println("Mapa: " + mapa.keySet());
		
		// value -> devuelve otra colección con las value
		System.out.println("Mapa: " + mapa.values());
		
		// entrySet -> devuelve todos los elementos como key = value
		System.out.println("Mapa: " + mapa.entrySet());
		
		// Este lo añado yo
		System.out.println("ingles: " + mapa.get("ingles"));
		
		
	}

}
