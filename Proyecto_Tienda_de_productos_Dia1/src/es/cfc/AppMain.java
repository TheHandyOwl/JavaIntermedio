package es.cfc;

import es.cfc.business.GestionProductos;
import es.cfc.models.Producto;

public class AppMain {

	public static void main(String[] args) {

		GestionProductos gestionProductos = new GestionProductos();

		Producto producto1 = new Producto("Producto 1", 200);
		Producto producto2 = new Producto("Producto 2", 300);

		// Insertar
		gestionProductos.insertarProducto(producto1);
		gestionProductos.insertarProducto(producto1);
		gestionProductos.insertarProducto(producto2);
		gestionProductos.insertarProducto(producto2);

		// Ver todos
		System.out.println(gestionProductos.verTodos());

		// Buscar
		System.out.println(gestionProductos.buscarProducto(1));

		// Modificar
		gestionProductos.modificarProducto(1, 250);
		System.out.println(gestionProductos.buscarProducto(1));

		// Eliminar
		gestionProductos.eliminarProducto(1);
		gestionProductos.modificarProducto(1, 250);
		System.out.println(gestionProductos.verTodos());

		// Insertar
		Producto producto3 = new Producto("Producto 3", 200);
		Producto producto4 = new Producto("Producto 4", 300);
		gestionProductos.insertarProducto(producto1);
		gestionProductos.insertarProducto(producto1);
		gestionProductos.insertarProducto(producto2);
		gestionProductos.insertarProducto(producto2);
		gestionProductos.insertarProducto(producto3);
		gestionProductos.insertarProducto(producto3);
		gestionProductos.insertarProducto(producto4);
		gestionProductos.insertarProducto(producto4);

		// Ver todos
		System.out.println(gestionProductos.verTodos());

	}

}
