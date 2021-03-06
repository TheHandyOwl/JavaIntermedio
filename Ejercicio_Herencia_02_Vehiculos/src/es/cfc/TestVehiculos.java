package es.cfc;

import es.cfc.models.Avion;
import es.cfc.models.Barco;
import es.cfc.models.Coche;
import es.cfc.models.Tren;

public class TestVehiculos {

	public static void main(String[] args) {
	
		Avion avion = new Avion(100, "Boing", "747", 5000, "Rayanair");
		System.out.println(avion);
		System.out.println(avion.avanzar());
		System.out.println(avion.retroceder());
		System.out.println(avion.girarDerecha());
		System.out.println(avion.girarIzquierda());
		
		Barco barco = new Barco(200, "Costa Cruceros", "Princesa", 160, "Recreativo");
		System.out.println(barco);
		System.out.println(barco.avanzar());
		System.out.println(barco.retroceder());
		System.out.println(barco.girarDerecha());
		System.out.println(barco.girarIzquierda());
		
		Coche coche = new Coche(5, "Citroen", "Xsara", false, "0000BBB");
		System.out.println(coche);
		System.out.println(coche.avanzar());
		System.out.println(coche.retroceder());
		System.out.println(coche.girarDerecha());
		System.out.println(coche.girarIzquierda());
		
		Tren tren = new Tren(400, "Talgo", "Eco", 10, "Madrid", "Valencia");
		System.out.println(tren);
		System.out.println(tren.avanzar());
		System.out.println(tren.retroceder());
		System.out.println(tren.girarDerecha());
		System.out.println(tren.girarIzquierda());
		
	}
	
}
