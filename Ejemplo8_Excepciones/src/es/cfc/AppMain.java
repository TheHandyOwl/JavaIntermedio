package es.cfc;

import es.cfc.business.Operaciones;

public class AppMain {

	// En el main NUNCA PROPAGAR excepciones
	public static void main(String[] args) {

		
		
		// Dividir por 0
		System.out.println("--- Dividir por 0 ---");
		Operaciones operaciones = new Operaciones();
		try {
			//System.out.println(operaciones.dividir(8, 2));
			System.out.println(operaciones.dividir(2, 0));
		} catch (Exception e) {
			System.out.println("Error: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		
		
		// Transformar el número en String a un número int
		System.out.println("--- String 2 int: foreach ---");
		int suma = 0;
		for (String string : args) {
			try {
				// Aquí colocamos todas las líneas que pueden generar error
				int numero = Integer.parseInt(string);

				suma += numero;	
			} catch (NumberFormatException e) {
				System.out.println("No se pudo convertir a número: " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Error: " + e.getLocalizedMessage());
				e.printStackTrace();
			} finally {
				// Código que se ejecuta siempre, haya o no excepción.
				System.out.println("Subtotal: " + suma);
			}
		}
		
		System.out.println("Total: " + suma);

		// Otro for para sumar
		System.out.println("--- String 2 int: for i ---");
		suma = 0;
		for (int i = 0 - 1; i < args.length; i++) {
			try {
				// Aquí colocamos todas las líneas que pueden generar error
				int numero = Integer.parseInt(args[i]);

				suma += numero;	
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Índice fuera de rango: " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("No se pudo convertir a número: " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Error: " + e.getLocalizedMessage());
				e.printStackTrace();
			} finally {
				// Código que se ejecuta siempre, haya o no excepción.
				System.out.println("Subtotal: " + suma);
			}
		}
		
		System.out.println("Total: " + suma);

	
	}

}
