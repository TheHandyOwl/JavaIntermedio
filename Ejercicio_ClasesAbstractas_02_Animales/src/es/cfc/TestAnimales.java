package es.cfc;

import es.cfc.models.Animal;
import es.cfc.models.Buitre;
import es.cfc.models.Gorrion;
import es.cfc.models.Gusano;
import es.cfc.models.Pajaro;
import es.cfc.models.Perro;
import es.cfc.models.Pez;

public class TestAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Gusano: -----");
		Gusano gusano = new Gusano();
		System.out.println(gusano.toString());

		System.out.println("Pajaro: -----");
		Pajaro pajaro = new Pajaro();
		System.out.println(pajaro.toString());

		System.out.println("Perro: -----");
		Perro perro = new Perro();
		System.out.println(perro.toString());

		System.out.println("Pez: -----");
		Pez pez = new Pez();
		System.out.println(pez.toString());

		System.out.println("Gorrion: -----");
		Gorrion gorrion = new Gorrion();
		System.out.println(gorrion.toString());

		System.out.println("Buitre: -----");
		Buitre buitre = new Buitre();
		System.out.println(buitre.toString());

	}

}
