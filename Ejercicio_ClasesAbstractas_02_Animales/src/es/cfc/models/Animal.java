package es.cfc.models;

public abstract class Animal {
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void comer();
	public abstract void moverse();

	@Override
	public String toString() {
		return "Soy animal!!!";
	}
	
}
