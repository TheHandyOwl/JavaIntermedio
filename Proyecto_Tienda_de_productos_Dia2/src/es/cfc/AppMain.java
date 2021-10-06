package es.cfc;

import es.cfc.business.GestionProductos;
import es.cfc.models.Producto;

public class AppMain {

	public static void main(String[] args) {

		GestionProductos gestionProductos = new GestionProductos();

		System.out.println("--- Todos: " + gestionProductos.verTodos());
		for (Producto producto : gestionProductos.verTodos()) {
			System.out.println("- " + producto);
		}

		// Buscar
		System.out.println("--- Buscar producto 1: " + gestionProductos.buscarProducto(1));

		// Insertar
		Producto producto = new Producto(5, "Producto nuevo", 200);
		gestionProductos.insertarProducto(producto);
		System.out.println("--- Todos: " + gestionProductos.verTodos());

		// Modificar
		gestionProductos.modificarProducto(4, 250);
		System.out.println("--- Buscar producto 4: " + gestionProductos.buscarProducto(4));
		gestionProductos.modificarProducto(5, 500);
		System.out.println("--- Buscar producto 5: " + gestionProductos.buscarProducto(5));

		// Eliminar
		gestionProductos.eliminarProducto(1);
		System.out.println("--- Todos: " + gestionProductos.verTodos());

		// Ver todos
		System.out.println("--- Todos: " + gestionProductos.verTodos());

	}

}
