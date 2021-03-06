package es.cfc.persistencia;

import java.util.List;

import es.cfc.models.Producto;

public interface ProductosDAO {

	public abstract List<Producto> verTodos();

	public abstract Producto buscar(int id);

	public abstract boolean insertar(Producto nuevoProducto);

	public abstract boolean modificar(int id, double precio);

	public abstract boolean eliminar(int id);

}
