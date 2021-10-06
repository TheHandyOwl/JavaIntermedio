package es.cfc.business;

import es.cfc.models.Contacto;

public class Agenda {
	
	private Contacto contactos[] = new Contacto[10];
	
	public void agregarContacto(Contacto nuevo) {
		contactos[nuevo.getID() - 1] = nuevo;
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

}
