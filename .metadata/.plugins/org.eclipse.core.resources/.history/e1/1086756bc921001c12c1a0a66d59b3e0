package es.cfc;

//cmd + shift + o
import es.cfc.models.Animal;
import es.cfc.models.Pajaro;
import es.cfc.models.Volador;


public class AppMain {

	public static void main(String[] args) {
		Pajaro pajaro = new Pajaro("Piolín", true);
		System.out.println("Nombre: " + pajaro.getNombre());
		System.out.println("¿Doméstico? " + pajaro.isDomestico());
		System.out.println("Description: " + pajaro.toString());
		pajaro.volar();
		
		// Con las interfaces también podemos hacer polimorfismo
		Volador volador = new Pajaro(null, false);
		Animal animal = new Pajaro(null, false);
		
		System.out.println("¿Instancia de Animal?" + (animal instanceof Animal));
		System.out.println("¿Instancia de Pajaro?" + (animal instanceof Pajaro));
		System.out.println("¿Instancia de Volador?" + (animal instanceof Volador));
	}

}
