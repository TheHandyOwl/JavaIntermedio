package es.cfc;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	/*
	 * EJERCICIO 3 Cree un programa almacene números del 0 al 9 en un array y en una
	 * lista, e imprima sus valores.
	 */

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		for(int i = 0; i <= 9; i++) {
			numeros.add(i);
			//System.out.println(i);
		}
		System.out.println("numeros: " + numeros);
		
		List<Integer> numericos = new ArrayList<Integer>();
		numericos.add(0);
		numericos.add(new Integer(1));
		numericos.add(new Integer("2"));
		for(int i = 4; i <= 9; i++) {
			numericos.add(i);
			//System.out.println(i);
		}
		System.out.println("numericos: " + numericos);

	}
	
}
