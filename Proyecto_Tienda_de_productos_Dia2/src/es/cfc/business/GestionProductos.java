package es.cfc.business;

import java.util.List;

import es.cfc.models.Producto;
import es.cfc.persistencia.ProductosDAO;
import es.cfc.persistencia.ProductosDAOImpl;

public class GestionProductos {

	private ProductosDAO productosDAO = new ProductosDAOImpl();

	public GestionProductos() {
	}

	public List<Producto> verTodos() {
		return productosDAO.verTodos();
	}

	public Producto buscarProducto(int id) {
		return productosDAO.buscar(id);
	}

	public boolean insertarProducto(Producto producto) {
		return productosDAO.insertar(producto);
	}

	public boolean modificarProducto(int id, double precio) {
		return productosDAO.modificar(id, precio);
	}

	public boolean eliminarProducto(int id) {
		return productosDAO.eliminar(id);
	}

}
