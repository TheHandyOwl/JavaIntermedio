package es.cfc.business;

import java.util.List;

import es.cfc.models.Producto;
import es.cfc.persistencia.ProductosDAO;
import es.cfc.persistencia.ProductosDAOImpl;

public class GestionProductos {

	// DAO (Data Access Object)
	private ProductosDAO dao = new ProductosDAOImpl();

	public List<Producto> verTodos() {
		return dao.verTodos();
	}

	public Producto buscarProducto(int id) {
		return dao.buscar(id);
	}

	public boolean insertarProducto(Producto producto) {
		return dao.insertar(producto);
	}

	public boolean modificarProducto(int id, double precio) {
		return dao.modificar(id, precio);
	}

	public boolean eliminarProducto(int id) {
		return dao.eliminar(id);
	}

}
