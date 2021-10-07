package es.cfc.business;

import java.util.List;

import es.cfc.models.Contacto;
import es.cfc.persistencia.ContactosDAO;
import es.cfc.persistencia.ContactosDAOImpl;

public class GestionContactos {

	private ContactosDAO dao = new ContactosDAOImpl();

	public List<Contacto> verTodos() {
		return dao.verTodos();
	}

	public List<Contacto> buscarApodo(String apodo) {
		return dao.buscarApodo(apodo);
	}

	public List<Contacto> buscarEmpresa(String nombre) {
		return dao.buscarEmpresa(nombre);
	}

	public List<Contacto> buscarNombre(String nombre) {
		return dao.buscarNombre(nombre);
	}

	public boolean insertarAmigo(Contacto contacto) {
		return dao.insertarAmigo(contacto);
	}

	public boolean insertarContacto(Contacto contacto) {
		return dao.insertarContacto(contacto);
	}

	public boolean insertarProfesional(Contacto contacto) {
		return dao.insertarProfesional(contacto);
	}

	public boolean modificar(int id, long telefono) {
		return dao.modificar(id, telefono);
	}

	public boolean eliminar(int id) {
		return dao.eliminar(id);
	}

}
