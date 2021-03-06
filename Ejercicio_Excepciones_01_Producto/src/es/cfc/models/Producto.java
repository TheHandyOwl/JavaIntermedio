package es.cfc.models;

import es.cfc.Utils.ProductoException;

public class Producto {

	private int id = 0;
	private String nombre;
	private double precio;
	private String proveedor;
	private String descripcion;

	public Producto() {
	}

	public Producto(int id, String nombre, double precio, String proveedor, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void comprobar() throws ProductoException {


		// ASERCIONES DETIENEN EL CÓDIGO (testing o debugging): '-ae' en el 'Run configurations'
		// Este error es permanente y cancelan la ejecución si configuraqmos las extensiones
		assert(precio > 0) : "El precio debe ser mayor que 0";
		

		// EXCEPCIONES CONTINUAN EJECUTANDO SI ESTÁN CONTROLADAS
		if (id == 0) {
			throw new ProductoException("El producto '" + nombre + "' no tiene ID asignado");
		}

		// Aquí no llegaría porque petaría en el assert
		if (precio <= 0) {
			//throw new ProductoException("El producto '" + nombre + "' no tiene precio válido");
			System.out.println("El precio debe ser mayor que 0");
		}
		

	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", proveedor=" + proveedor + ", descripcion="
				+ descripcion;
	}

}
