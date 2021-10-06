package es.cfc.business;

import java.util.Set;

import es.cfc.models.Producto;
import es.cfc.persistencia.ProductosDAO;
import es.cfc.persistencia.ProductosDAOImpl;

public class GestionProductos {

	private ProductosDAO productosDAO = new ProductosDAOImpl();
	
	public GestionProductos() {
		// TODO Auto-generated constructor stub
	}
	
	public Set<Producto> verTodos() {
		System.out.println("Buscando todos");
		return productosDAO.verTodos();
	}
	
	public Producto buscarProducto(int id) {
		System.out.println("Buscando id: " + id);
		return productosDAO.buscar(id);
	}
	
	public boolean insertarProducto(Producto producto) {
		boolean resultado = productosDAO.insertar(producto);
		return resultado;
		/*
		if (resultado == true) {
			System.out.println("Producto guardado: " + producto.getDescripcion());
		} else {
			System.out.println("Producto NO guardado: " + producto.getDescripcion());
		}
		*/
	}
	
	public boolean modificarProducto(int id, double precio) {
		boolean resultado = productosDAO.modificar(id, precio);
		return resultado;
		/*
		if (resultado == true) {
			Producto producto = productosDAO.buscar(id);
			System.out.println("Producto modificado: " + producto.getDescripcion());
		} else {
			System.out.println("Producto NO modificado: " + id);
		}
		*/
	}
	
	public boolean eliminarProducto(int id) {
		System.out.println("Eliminar producto: " + id);
		return productosDAO.eliminar(id);
	}

}