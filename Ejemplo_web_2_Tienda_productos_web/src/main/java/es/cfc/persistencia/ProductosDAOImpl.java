package es.cfc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.cfc.models.Producto;

public class ProductosDAOImpl implements ProductosDAO {

	private Connection conexion;

	private void abrirConexion() {
		try {
			// Cargar el driver de MySQL
			Class.forName("com.mysql.jdbc.Driver");
			// Abrir la conexión
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al abrir la conexion");
			e.printStackTrace();
		}
	}

	private void cerrarConexion() {
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion");
			e.printStackTrace();
		}
	}

	@Override
	public List<Producto> verTodos() {
		List<Producto> lista = new ArrayList<Producto>();

		try {
			abrirConexion();

			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM productos;");

			while (rs.next()) {
				Producto producto = new Producto(rs.getInt("ID"), rs.getString("DESCRIPCION"), rs.getDouble("PRECIO"));
				lista.add(producto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return lista;
	}

	@Override
	public Producto buscar(int id) {
		Producto productoEncontrado = null;

		try {
			abrirConexion();

			String query = "SELECT * FROM productos WHERE ID = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				productoEncontrado = new Producto(rs.getInt("ID"), rs.getString("DESCRIPCION"), rs.getDouble("PRECIO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return productoEncontrado;
	}

	@Override
	public boolean insertar(Producto nuevoProducto) {
		boolean insertado = false;
		try {
			abrirConexion();

			String query = "INSERT INTO productos VALUES (?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, nuevoProducto.getId());
			pst.setString(2, nuevoProducto.getDescripcion());
			pst.setDouble(3, nuevoProducto.getPrecio());
			int registros = pst.executeUpdate();

			if (registros > 0) {
				insertado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar el producto");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return insertado;
	}

	@Override
	public boolean modificar(int id, double precio) {
		boolean modificado = false;

		try {
			abrirConexion();

			String query = "UPDATE productos SET PRECIO = ? WHERE ID = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setDouble(1, precio);
			pst.setInt(2, id);
			int registros = pst.executeUpdate();

			if (registros > 0) {
				modificado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al modificar el producto");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return modificado;
	}

	@Override
	public boolean eliminar(int id) {
		boolean eliminado = false;

		try {
			abrirConexion();

			String query = "DELETE FROM productos WHERE ID = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, id);
			int registros = pst.executeUpdate();

			if (registros > 0) {
				eliminado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al eliminar el producto");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return eliminado;
	}

}
