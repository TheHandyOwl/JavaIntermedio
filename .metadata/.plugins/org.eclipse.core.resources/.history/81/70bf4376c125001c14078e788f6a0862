package es.cfc.business;

import es.cfc.models.Amigo;
import es.cfc.models.Contacto;
import es.cfc.models.Profesional;

public class Agenda {
	
	private Contacto contactos[] = new Contacto[10];
	
	public void agregarContacto(Contacto nuevo) {
		contactos[nuevo.getID()] = nuevo;
	}
	
	public Contacto[] verContactos() {
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
	
	public Contacto[] buscarContactosEnEmpresa(String empresa) {
		Contacto[] contactosEmpresa = new Contacto[contactos.length];

		int contador = 0;
		for (int i = 0; i < contactos.length; i++) {
			Contacto contacto = contactos[i];
			if (contacto instanceof Profesional) {
				Profesional profesional = (Profesional) contacto;
				if ( profesional.getEmpresa().equals(empresa)) {
					contactosEmpresa[contador] = contacto;
					contador ++;
				}
			}
		}
		
		return contactosEmpresa;		
	}

}
