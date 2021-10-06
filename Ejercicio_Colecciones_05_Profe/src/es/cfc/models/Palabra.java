package es.cfc.models;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

	private String palabra;
	private List<String> definiciones;

	public Palabra() {
		this.definiciones = new ArrayList<String>();
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public List<String> getDefiniciones() {
		return definiciones;
	}

	public void setDefiniciones(List<String> definiciones) {
		this.definiciones = definiciones;
	}

	@Override
	public String toString() {
		return "palabra=" + palabra + ", definiciones=" + definiciones;
	}

}
