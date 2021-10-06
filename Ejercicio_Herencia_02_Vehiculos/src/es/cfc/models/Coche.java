package es.cfc.models;

public class Coche extends Vehiculo{
	
	private boolean automatico;
	private String matricula;
	
	
	public Coche() {
		// TODO Auto-generated constructor stub
	}

	
	public Coche(int capacidad, String marca, String modelo, boolean automatico, String matricula) {
		super(capacidad, marca, modelo);
		this.automatico = automatico;
		this.matricula = matricula;
	}

	
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", automatico=" + automatico + ", matricula=" + matricula;
	}

}
