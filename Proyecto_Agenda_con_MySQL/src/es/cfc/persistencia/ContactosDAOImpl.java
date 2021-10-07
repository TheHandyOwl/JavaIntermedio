package es.cfc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.cfc.models.Amigo;
import es.cfc.models.Contacto;
import es.cfc.models.Profesional;
import es.cfc.models.Sexo;

public class ContactosDAOImpl implements ContactosDAO {

	private Connection conexion;

	private void abrirConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
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
	public List<Contacto> verTodos() {
		List<Contacto> contactos = new ArrayList<Contacto>();

		try {
			abrirConexion();
			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM CONTACTOS;");

			while (rs.next()) {
				Contacto contacto = new Contacto(rs.getInt("ID"), rs.getString("NOMBRE"), (long) rs.getLong("TELEFONO"),
						Sexo.valueOf(rs.getString("SEXO")));
				contactos.add(contacto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return contactos;
	}

	@Override
	public List<Contacto> buscarApodo(String apodo) {
		List<Contacto> contactos = new ArrayList<Contacto>();

		try {
			abrirConexion();

			String query = "SELECT * FROM CONTACTOS WHERE APODO = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setString(1, apodo);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (rs.getString("APODO").equals(apodo)) {
					Contacto contacto = new Amigo(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getLong("TELEFONO"),
							Sexo.valueOf(rs.getString("SEXO")), rs.getString("APODO"), rs.getString("CUMPLE"));
					System.out.println("Contacto de apodos: " + (Amigo) contacto);
					contactos.add(contacto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return contactos;
	}

	@Override
	public List<Contacto> buscarEmpresa(String empresa) {
		List<Contacto> contactos = new ArrayList<Contacto>();

		try {
			abrirConexion();

			String query = "SELECT * FROM CONTACTOS WHERE EMPRESA = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setString(1, empresa);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (rs.getString("EMPRESA").equals(empresa)) {
					Contacto contacto = new Profesional(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getLong("TELEFONO"),
							Sexo.valueOf(rs.getString("SEXO")), rs.getString("EMAIL"), rs.getString("EMPRESA"));
					System.out.println("Contacto de empresa: " + (Profesional) contacto);
					contactos.add(contacto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return contactos;
	}

	@Override
	public List<Contacto> buscarNombre(String nombre) {
		List<Contacto> contactos = new ArrayList<Contacto>();

		try {
			abrirConexion();

			String query = "SELECT * FROM CONTACTOS WHERE NOMBRE = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setString(1, nombre);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Contacto contacto = new Contacto(rs.getInt("ID"), rs.getString("NOMBRE"), (long) rs.getLong("TELEFONO"),
						Sexo.valueOf(rs.getString("SEXO")));
				System.out.println("Contacto normal: " + (Contacto) contacto);
				contactos.add(contacto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return contactos;
	}

	@Override
	public boolean insertarAmigo(Contacto contacto) {
		boolean insertado = false;
		Amigo amigo = (Amigo) contacto;

		try {
			abrirConexion();

			String query = "INSERT INTO CONTACTOS (ID, NOMBRE, TELEFONO, SEXO, APODO, CUMPLE) VALUES (?, ?, ?, ?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, amigo.getID());
			pst.setString(2, amigo.getNombre());
			pst.setLong(3, amigo.getTelefono());
			pst.setString(4, amigo.getSexo().name());
			pst.setString(5, amigo.getApodo());
			pst.setString(6, amigo.getCumple());
			int registros = pst.executeUpdate();

			if (registros > 0) {
				insertado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar el producto");
			e.printStackTrace();
		}

		return insertado;
	}

	@Override
	public boolean insertarContacto(Contacto contacto) {
		boolean insertado = false;

		try {
			abrirConexion();

			String query = "INSERT INTO CONTACTOS (ID, NOMBRE, TELEFONO, SEXO) VALUES (?, ?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, contacto.getID());
			pst.setString(2, contacto.getNombre());
			pst.setLong(3, contacto.getTelefono());
			pst.setString(4, contacto.getSexo().name());
			int registros = pst.executeUpdate();

			if (registros > 0) {
				insertado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar el producto");
			e.printStackTrace();
		}

		return insertado;
	}

	@Override
	public boolean insertarProfesional(Contacto contacto) {
		boolean insertado = false;
		Profesional profesional = (Profesional) contacto;

		try {
			abrirConexion();

			String query = "INSERT INTO CONTACTOS (ID, NOMBRE, TELEFONO, SEXO, EMAIL, EMPRESA) VALUES (?, ?, ?, ?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setInt(1, profesional.getID());
			pst.setString(2, profesional.getNombre());
			pst.setLong(3, profesional.getTelefono());
			pst.setString(4, profesional.getSexo().name());
			pst.setString(5, profesional.getEmail());
			pst.setString(6, profesional.getEmpresa());
			int registros = pst.executeUpdate();

			if (registros > 0) {
				insertado = true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar el producto");
			e.printStackTrace();
		}

		return insertado;
	}

	@Override
	public boolean modificar(int id, long telefono) {
		boolean modificado = false;

		try {
			abrirConexion();

			String query = "UPDATE CONTACTOS SET TELEFONO = ? WHERE ID = ?;";
			PreparedStatement pst = conexion.prepareStatement(query);
			pst.setLong(1, telefono);
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

			String query = "DELETE FROM contactos WHERE ID = ?;";
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
