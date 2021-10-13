package es.cfc.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import es.cfc.models.Producto;

public class Carrito implements Serializable {

	/**
	 * Generamos ésto al implementar que es Serializable
	 * (Add generated serial version ID), o el default
	 */
	private static final long serialVersionUID = 1L;
	
	// Resto de propiedades
	private List<Producto> contenido = new ArrayList<Producto>();
	private double importe = 0.00;
	
	public void addProducto(Producto producto) {
		contenido.add(producto);
		importe += producto.getPrecio();
	}
	
	public void sacarProducto(int id) {
		Producto encontrado = null;
		
		for (Producto producto : contenido) {
			if (producto.getId() == id) {
				encontrado = producto;
				importe -= producto.getPrecio();
			}
		}
		
		contenido.remove(encontrado);
	}
	
	public List<Producto> getContenido() {
		return contenido;
	}
	
	public double getImporte() {
		return importe;
	}
	
}
