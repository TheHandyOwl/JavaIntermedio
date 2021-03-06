package es.cfc.models;

public class Tarea {

	private int id;
	private String description;
	private Estado estado;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(int id, String description, Estado estado) {
		super();
		this.id = id;
		this.description = description;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		//return "id=" + id + ", description=" + description + ", estado=" + estado; // "estado=EN_PROCESO"
		return "id=" + id + ", description=" + description + ", estado=" + estado.getEstado(); // "estado=en proceso"
	}
	
}
