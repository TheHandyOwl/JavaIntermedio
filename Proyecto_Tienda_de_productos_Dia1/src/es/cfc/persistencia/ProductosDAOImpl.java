package es.cfc.persistencia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cfc.models.Producto;

public class ProductosDAOImpl implements ProductosDAO {

	private Set<Producto> catalogo = new HashSet<Producto>();

	public ProductosDAOImpl() {
	}

	@Override
	public Set<Producto> verTodos() {
		return catalogo;
	}

	@Override
	public Producto buscar(int id) {
		Producto productoEncontrado = null;

		for (Producto producto : catalogo) {
			if (producto.getId() == id) {
				productoEncontrado = producto;
				break;
			}
		}

		return productoEncontrado;
	}

	@Override
	public boolean insertar(Producto nuevoProducto) {
		
		Iterator<Producto> iterador = catalogo.iterator();
		while (iterador.hasNext()) {
			Producto producto = iterador.next();
			if (nuevoProducto.getId() == producto.getId()) {
				return false;
			}
		}
		
		catalogo.add(nuevoProducto);
		return true;
	}

	@Override
	public boolean modificar(int id, double precio) {

		Iterator<Producto> iterador = catalogo.iterator();
		while (iterador.hasNext()) {
			Producto producto = iterador.next();
			if (producto.getId() == id) {
				producto.setPrecio(precio);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean eliminar(int id) {

		for (Producto producto : catalogo) {
			if (producto.getId() == id) {
				catalogo.remove(producto);
				return true;
			}
		}

		return false;
	}

}
