package es.cfc.business;

import java.util.HashSet;
import java.util.Set;

import es.cfc.models.Amigo;
import es.cfc.models.Contacto;
import es.cfc.models.Profesional;

/*
 * 
 * Cambiar a colección de tipo Set
 * Para que no haya contactos duplicados en la clase Contacto
 * sobreescribir equals y hashcode
 * 
 */

public class Agenda {
	
	private Set<Contacto> contactos = new HashSet<Contacto>();
	
	public void agregarContacto(Contacto nuevo) {
		contactos.add(nuevo);
	}
	
	public Set<Contacto> verContactos() {
		return contactos;
	}
	
	public Contacto buscar(String nombre) {		
		Contacto encontrado = null;
		
		for (Contacto contact : contactos) {
			if (contact.getNombre().equals(nombre)) {
				encontrado = contact;
				break;
			}
		}
		
		return encontrado;		
	}
	
	public Contacto buscarAmigo(String apodo) {
		Contacto encontradoAmigo = null;
		
		for (Contacto contact : contactos) {
			if (contact instanceof Amigo) {
				Amigo amigo = (Amigo) contact;
				if ( amigo.getApodo().equals(apodo)) {
					encontradoAmigo = contact;
					break;
				}
			}
		}
		
		return encontradoAmigo;		
	}
	
	public Set<Contacto> buscarContactosEnEmpresa(String empresa) {
		Set<Contacto> contactosEmpresa = new HashSet<Contacto>();

		for (Contacto contacto : contactos) {
			if (contacto instanceof Profesional) {
				Profesional profesional = (Profesional) contacto;
				if ( profesional.getEmpresa().equals(empresa)) {
					contactosEmpresa.add(profesional);
				}
			}
		}
		
		return contactosEmpresa;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactos == null) ? 0 : contactos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (contactos == null) {
			if (other.contactos != null)
				return false;
		} else if (!contactos.equals(other.contactos))
			return false;
		return true;
	}
	
}
