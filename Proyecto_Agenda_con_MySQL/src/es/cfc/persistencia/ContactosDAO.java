package es.cfc.persistencia;

import java.util.List;

import es.cfc.models.Contacto;

public interface ContactosDAO {

	public abstract List<Contacto> verTodos();

	public abstract List<Contacto> buscarApodo(String apodo);

	public abstract List<Contacto> buscarEmpresa(String empresa);

	public abstract List<Contacto> buscarNombre(String nombre);

	public abstract boolean insertar(Contacto contacto);

	public abstract boolean insertarAmigo(Contacto contacto);

	public abstract boolean insertarContacto(Contacto contacto);

	public abstract boolean insertarProfesional(Contacto contacto);

	public abstract boolean modificar(int id, long telefono);

	public abstract boolean eliminar(int id);

}
