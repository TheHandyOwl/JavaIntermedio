package es.cfc.business;

import es.cfc.utils.DividirException;

public class Operaciones {

	// Este método PROPAGA la excepción
	public double dividir(int num1, int num2) throws DividirException {
		if (num2 == 0) {
			throw new DividirException("El divisor es 0");
		}
		return num1 / num2;
	}


	public double multiplicar(int num1, int num2) {
		return num1 / num2;

	}


	public double restar(int num1, int num2) {
		return num1 / num2;
	}


	public double sumar(int num1, int num2) {
		return num1 / num2;
	}


}
