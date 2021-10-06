package es.cfc;

import es.cfc.models.Cactus;
import es.cfc.models.Planta;
import es.cfc.models.PlantaTropical;

public class TestPlantas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("tropical: -----");
		PlantaTropical tropical = new PlantaTropical("Familia", "genero", "especie", "vareidad", "Madrid");
		tropical.regar(100, 3);
		tropical.doSomething();
		System.out.println(tropical.toString());;

		System.out.println("cactus: -----");
		Cactus cactus = new Cactus("Familia", "genero", "especie", "vareidad", true);
		cactus.regar(100, 3);
		cactus.doSomething();
		System.out.println(cactus.toString());;

		System.out.println("plantaTropical: -----");
		Planta plantaTropical = new PlantaTropical("Familia", "genero", "especie", "vareidad", "Madrid");
		plantaTropical.regar(100, 3);
		//plantaTropical.doSomething();
		PlantaTropical otraPlantaTropical = (PlantaTropical) plantaTropical;
		otraPlantaTropical.regar(100, 3);
		otraPlantaTropical.doSomething();
		System.out.println(otraPlantaTropical.toString());;

		System.out.println("plantaCactus: -----");
		Planta plantaCactus = new Cactus("Familia", "genero", "especie", "vareidad", true);
		plantaCactus.regar(100, 3);
		//plantaCactus.doSomething();
		Cactus otroCactus = (Cactus) plantaCactus;
		otroCactus.regar(100, 3);
		otroCactus.doSomething();
		System.out.println(otroCactus.toString());;
		
		System.out.println("¿Iguales? " + plantaTropical.equals(otraPlantaTropical));
		System.out.println("¿Iguales? " + plantaCactus.equals(otroCactus));
		
	}

}
