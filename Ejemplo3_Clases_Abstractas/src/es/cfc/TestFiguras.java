package es.cfc;

import es.cfc.models.Circulo;
import es.cfc.models.Figura;
import es.cfc.models.Rectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		
		// Figura ahora es una clase abstracta
		/*
		Figura figura = new Figura(6, 9);
		System.out.println(figura.posicion());
		*/
		
		Circulo circulo = new Circulo(10, 3, 7.56);
		System.out.println(circulo.posicion());
		System.out.println("Área: " + circulo.calcularArea());
		
		Rectangulo rectangulo = new Rectangulo(4, 9, 3.16, 5.25);
		System.out.println(rectangulo.posicion());
		System.out.println("Área: " + rectangulo.calcularArea());
		
		// Polimorfismo. Revisar ejemplo de herencia, persona, empleado y jefe
		Figura figura = new Circulo(10, 3, 7.56);
		System.out.println(figura.posicion());
		System.out.println("Área: " + figura.calcularArea());

	}

}
