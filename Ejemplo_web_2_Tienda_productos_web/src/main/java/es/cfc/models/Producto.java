package es.cfc.models;

import java.io.Serializable;

public class Producto implements Serializable {

	
	/**
	 * Al serializar Carrito, debemos tener en cuenta que contiene Producto
	 * Y Producto también tiene que ser Serializable
	 */
	private static final long serialVersionUID = 888662350337662604L;
	
	// Resto de propiedades
	private int id;
	private String descripcion;
	private double precio;

	public Producto() {
	}

	public Producto(int id, String descripcion, double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

}
