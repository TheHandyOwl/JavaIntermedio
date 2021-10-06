package es.cfc.models;

public abstract class Planta {
	
	private String familia;
	private String genero;
	private String especie;
	private String variedad;
	
	public Planta() {
		// TODO Auto-generated constructor stub
	}
	
	public Planta(String familia, String genero, String especie, String variedad) {
		super();
		this.familia = familia;
		this.genero = genero;
		this.especie = especie;
		this.variedad = variedad;
	}
	
	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public abstract void regar(int cantidad, int tiempo);

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + ((familia == null) ? 0 : familia.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((variedad == null) ? 0 : variedad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (familia == null) {
			if (other.familia != null)
				return false;
		} else if (!familia.equals(other.familia))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (variedad == null) {
			if (other.variedad != null)
				return false;
		} else if (!variedad.equals(other.variedad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "familia=" + familia + ", genero=" + genero + ", especie=" + especie + ", variedad=" + variedad;
	}
	
}
