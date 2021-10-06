package es.cfc.models;

public class Cactus extends Planta {

	private boolean espinas;
	

	public Cactus() {
		// TODO Auto-generated constructor stub
	}
	
	public Cactus(String familia, String genero, String especie, String variedad, boolean espinas) {
		super(familia, genero, especie, variedad);
		this.espinas = espinas;
	}
	
	public boolean getEspinas() {
		return espinas;
	}

	public void setEspinas(boolean espinas) {
		this.espinas = espinas;
	}

	@Override
	public void regar(int cantidad, int tiempo) {
		// TODO Auto-generated method stub
		System.out.println("Regar con " + cantidad + " ml cada " + tiempo + " días");
	}
	
	public void doSomething() {
		System.out.println("Yo realmente soy un cactus");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", espinas=" + espinas;
	}
	
}
