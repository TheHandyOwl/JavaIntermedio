package es.cfc.models;

public class Profesional extends Contacto {

	private String email;
	private String empresa;
	
	public Profesional() {
		// TODO Auto-generated constructor stub
	}

	public Profesional(String nombre, long telefono, Sexo sexo, String email, String empresa) {
		super(nombre, telefono, sexo);
		this.email = email;
		this.empresa = empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + ", email=" + email + ", empresa=" + empresa;
	}
	
}
