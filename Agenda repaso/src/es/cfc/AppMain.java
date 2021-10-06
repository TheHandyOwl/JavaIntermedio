package es.cfc;

import es.cfc.business.Agenda;
import es.cfc.models.Contacto;

public class AppMain {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/
	
	public static void main(String[] args) {
		
		Agenda objAgenda = new Agenda();
		
		Contacto maria = new Contacto(1, "Maria", 616111111L, 'M');
		Contacto juan = new Contacto(2, "Juan", 626111111L, 'H');
		
		System.out.println("Contactos agregados:");
		System.out.println(maria + "\n" + juan);
		
		objAgenda.agregarContacto(maria);
		objAgenda.agregarContacto(juan);
		
		System.out.println("Ver agenda:");
		for (int i = 0; i < objAgenda.verContactos().length; i++) {
			Contacto contacto = objAgenda.verContactos()[i];
			if (contacto != null) {
				System.out.println(contacto);
			}
		}
		
		System.out.println("Buscar contacto:");
		Contacto buscarContacto = objAgenda.buscarContacto("Maria");
		System.out.println(buscarContacto);
	}

}
