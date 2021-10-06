package es.cfc.models;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

	/*
	 * EJERCICIO 5 Cree un programa que implemente un diccionario. El diccionario
	 * debe contener palabras en castellano y una lista de posibles significados de
	 * cada palabra. Crear la clase Palabra que permita almacenar la información de
	 * una palabra, junto con sus definiciones. Utilizar un objeto HashMap para
	 * almacenar palabras en la clase Diccionario.
	 */

	private List<String> significados = new ArrayList<String>();
	
	public Palabra() {
	}

	public Palabra(List<String> significados) {
		super();
		this.significados = significados;
	}

	public List<String> getSignificados() {
		return significados;
	}

	public void setSignificado(String significado) {
		this.significados.add(significado);
	}

	@Override
	public String toString() {
		return "significados=" + significados;
	}
	
}
