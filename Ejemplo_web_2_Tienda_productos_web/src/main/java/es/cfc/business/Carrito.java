package es.cfc.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import es.cfc.models.Producto;

public class Carrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8833943761641144944L;
	
	/**
	 * Generamos ésto al implementar que es Serializable
	 * (Add generated serial version ID), o el default
	 */
	//private static final long serialVersionUID = 1L;
	
	// Resto de propiedades
	private List<Producto> contenido = new ArrayList<Producto>();
	private double importe;
	
	public void addProducto(Producto producto) {
		contenido.add(producto);
		//importe = importe + producto.getPrecio();
		//importe += producto.getPrecio();
		importe += Math.round(producto.getPrecio() * 100.0) / 100.0; // ¿Redondeamos?
	}
	
	public void sacarProducto(int id) {
		Producto encontrado = null;
		
		for (Producto producto : contenido) {
			if (producto.getId() == id) {
				encontrado = producto;
				//importe -= producto.getPrecio();
				importe -= Math.round(producto.getPrecio() * 100.0) / 100.0; // ¿Redondeamos?
				break;
			}
		}
		
		contenido.remove(encontrado);
		if (importe < 0) {
			importe = 0.00;
		}
	}
	
	public List<Producto> getContenido() {
		return contenido;
	}
	
	public double getImporte() {
		return importe;
	}
	
}
