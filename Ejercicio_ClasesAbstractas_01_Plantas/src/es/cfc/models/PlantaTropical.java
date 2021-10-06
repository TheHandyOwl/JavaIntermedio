package es.cfc.models;

public class PlantaTropical extends Planta {

	private String procedencia;

	public PlantaTropical() {
		// TODO Auto-generated constructor stub
	}
	
	public PlantaTropical(String familia, String genero, String especie, String variedad, String procedencia) {
		super(familia, genero, especie, variedad);
		this.procedencia = procedencia;
	}
	
	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	@Override
	public void regar(int cantidad, int tiempo) {
		// TODO Auto-generated method stub
		System.out.println("Regar con " + cantidad + " ml cada " + tiempo + " horas");
	}
	
	public void doSomething() {
		System.out.println("Yo realmente soy una planta tropical");
	}

	@Override
	public String toString() {
		return super.toString() + ", procedencia=" + procedencia;
	}
	
}
