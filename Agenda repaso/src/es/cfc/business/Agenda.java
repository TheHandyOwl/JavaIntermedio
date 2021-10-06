package es.cfc.business;

import es.cfc.models.Contacto;

public class Agenda {

	private Contacto contactos[] = new Contacto[10];

	public void agregarContacto(Contacto nuevoContacto) {
		contactos[nuevoContacto.getId() - 1] = nuevoContacto;
	}
	
	public Contacto[] verContactos() {
		return contactos;
	}
	
	public Contacto buscarContacto(String nombre) {
		Contacto contactoEncontrado = null;
		
		for (Contacto contacto : contactos) {
			if (contacto.getNombre() == nombre) {
				contactoEncontrado = contacto;
				break;
			}
		}
		
		return contactoEncontrado;
	}
	
}
