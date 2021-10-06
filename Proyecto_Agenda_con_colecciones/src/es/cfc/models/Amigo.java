package es.cfc.models;

public class Amigo  extends Contacto {

	private String apodo;
	private String cumple;
	
	public Amigo() {
		// TODO Auto-generated constructor stub
	}

	public Amigo(String nombre, long telefono, Sexo sexo, String apodo, String cumple) {
		super(nombre, telefono, sexo);
		this.apodo = apodo;
		this.cumple = cumple;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getCumple() {
		return cumple;
	}

	public void setCumple(String cumple) {
		this.cumple = cumple;
	}

	@Override
	public String toString() {
		return super.toString() + ", apodo=" + apodo + ", cumple=" + cumple;
	}
	
	

}
