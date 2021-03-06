package es.cfc;

import es.cfc.models.Circulo;
import es.cfc.models.Figura;
import es.cfc.models.Rectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		
		Figura figura = new Figura(6, 9);
		System.out.println(figura.posicion());
		
		Circulo circulo = new Circulo(10, 3, 7.56);
		System.out.println(circulo.posicion());
		
		Rectangulo rectangulo = new Rectangulo(4, 9, 3.16, 5.25);
		System.out.println(rectangulo.posicion());

	}

}
