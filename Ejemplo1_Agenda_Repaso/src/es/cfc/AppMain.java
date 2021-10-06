package es.cfc;

import es.cfc.business.Agenda;
import es.cfc.models.Contacto;

public class AppMain {
	
	public static void main(String[] args) {
		
		Contacto maria = new Contacto();
		maria.setID(1);
		maria.setNombre("Maria");
		maria.setTelefono(616111111L);
		maria.setSexo('M');
		
		
		Contacto juan = new Contacto(2, "Juan", 616222222L, 'H');
		
		//System.out.println(maria);
		//System.out.println(juan);
		
		Agenda objAgenda = new Agenda();
		
		// Agregar los contactos a la agenda
		objAgenda.agregarContacto(maria);
		objAgenda.agregarContacto(juan);
		
		// Mostrar todos los contactos
		Contacto[] misContactos = objAgenda.verContactos();
		
		for(int i=0; i < misContactos.length; i++ ) {
			if (misContactos[i] != null) {
				System.out.println(misContactos[i]);
			}	
		}
		
		/*
		for(int i=0; i < objAgenda.verContactos().length; i++ ) {
			System.out.println(objAgenda.verContactos()[i]);
		}*/
		
		// Buscar a Maria
		System.out.println(objAgenda.buscar("Maria"));

		
	}
	
	

}








