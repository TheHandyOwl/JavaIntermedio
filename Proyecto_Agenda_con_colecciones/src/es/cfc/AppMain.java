package es.cfc;

import java.util.Arrays;
import java.util.Set;

import es.cfc.business.Agenda;
import es.cfc.models.Amigo;
import es.cfc.models.Contacto;
import es.cfc.models.Profesional;
import es.cfc.models.Sexo;

public class AppMain {

	public static void main(String[] args) {

		// Contacto
		Contacto maria = new Contacto("Maria", 616111111L, Sexo.M);
		Contacto maria2 = new Contacto("Maria", 616111111L, Sexo.H);
		Contacto maria3 = new Contacto("Maria", 616111111L, Sexo.M);
		Contacto juan = new Contacto("Juan", 616222222L, Sexo.H);
		// Amigo
		Amigo lucas = new Amigo("Lucas", 6163333333L, Sexo.H, "El pato", "5 Noviembre");
		Amigo laura = new Amigo("Laura", 6164444444L, Sexo.M, "Pecas", "12 Octubre");
		// Profesional
		Profesional elena = new Profesional("Elena", 616555555L, Sexo.M, "elena@calderon.es", "Calderon");
		Profesional carlos = new Profesional("Carlos", 616666666L, Sexo.H, "carlos@hp.es", "HP");
		Profesional susana = new Profesional("Susana", 616777777L, Sexo.M, "susana@calderon.es", "Calderon");

		// Agenda
		Agenda objAgenda = new Agenda();
		objAgenda.agregarContacto(maria);
		objAgenda.agregarContacto(maria2);
		objAgenda.agregarContacto(maria3);
		objAgenda.agregarContacto(juan);
		objAgenda.agregarContacto(lucas);
		objAgenda.agregarContacto(laura);
		objAgenda.agregarContacto(elena);
		objAgenda.agregarContacto(carlos);
		objAgenda.agregarContacto(susana);

		// Mostrar todos los contactos
		Set<Contacto> misContactos = objAgenda.verContactos();
		System.out.println("--- Contactos ---");
		for (Contacto contacto : misContactos) {
			System.out.println(contacto);
		}

		// Buscar Contacto
		System.out.println("--- Buscar contacto: ---\n" + objAgenda.buscar("Maria"));
		// Buscar Amigo
		System.out.println("--- Buscar amigo: ---\n" + objAgenda.buscar("Lucas"));
		// Buscar Apodo
		System.out.println("--- Buscar apodo: ---\n" + objAgenda.buscarAmigo("El pato"));
		// Buscar contactos de empresa
		Set<Contacto> contactosCalderon = objAgenda.buscarContactosEnEmpresa("Calderon");
		System.out.println("--- Contactos de empresa: ---");
		for (Contacto contacto : objAgenda.verContactos()) {
			System.out.println(contacto);
		}
		
		System.out.println("--- o todo junto: ---");
		System.out.println(contactosCalderon);

	}

}
