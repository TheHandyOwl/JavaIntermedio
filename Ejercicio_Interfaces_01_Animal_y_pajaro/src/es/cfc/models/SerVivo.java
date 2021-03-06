package es.cfc.models;

import es.cfc.models.interfaces.Habitat;
import es.cfc.models.interfaces.Tiempo;

public class SerVivo implements Habitat, Tiempo {

	private int year;
	private String habitat;

	public SerVivo() {
		// TODO Auto-generated constructor stub
	}

	public SerVivo(int year, String habitat) {
		super();
		this.year = year;
		this.habitat = habitat;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void esperanzaVida() {
		// TODO Auto-generated method stub
		System.out.println("Tiene una esperanza de vida de " + year + " años");
	}

	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		System.out.println("Vive en " + habitat);
	}

	@Override
	public String toString() {
		return "year=" + year + ", habitat=" + habitat;
	}

}
