package es.cfc;

import es.cfc.business.GestionContactos;
import es.cfc.models.Amigo;
import es.cfc.models.Contacto;
import es.cfc.models.Profesional;
import es.cfc.models.Sexo;
import es.cfc.models.TipoContacto;

public class AppMain {

	public static void main(String[] args) {

		GestionContactos gestionContactos = new GestionContactos();

		// Contacto
		Contacto maria = new Contacto(1, "Maria", 616111111L, Sexo.M);
		Contacto maria2 = new Contacto(2, "Maria", 616111111L, Sexo.H);
		Contacto maria3 = new Contacto(3, "Maria", 616111111L, Sexo.M);
		Contacto juan = new Contacto(4, "Juan", 616222222L, Sexo.H);
		gestionContactos.insertarContacto(maria);
		gestionContactos.insertarContacto(maria2);
		gestionContactos.insertarContacto(maria3);
		gestionContactos.insertarContacto(juan);
		// Amigo
		Amigo lucas = new Amigo(5, "Lucas", 6163333333L, Sexo.H, "El pato", "5 Noviembre");
		Amigo laura = new Amigo(6, "Laura", 6164444444L, Sexo.M, "Pecas", "12 Octubre");
		gestionContactos.insertarAmigo(lucas);
		gestionContactos.insertarAmigo(laura);
		// Profesional
		Profesional elena = new Profesional(7, "Elena", 616555555L, Sexo.M,
				"elena@calderon.es", "Calderon");
		Profesional carlos = new Profesional(8, "Carlos", 616666666L, Sexo.H, "carlos@hp.es",
				"HP");
		Profesional susana = new Profesional(9, "Susana", 616777777L, Sexo.M,
				"susana@calderon.es", "Calderon");
		gestionContactos.insertarProfesional(elena);
		gestionContactos.insertarProfesional(carlos);
		gestionContactos.insertarProfesional(susana);

		// Mostrar todos los contactos
		System.out.println("--- Contactos: " + gestionContactos.verTodos());
		for (Contacto contacto : gestionContactos.verTodos()) {
			System.out.println("- " + contacto);
		}

		// Modifica
		gestionContactos.modificar(1, 626666666L);
		System.out.println("--- Contactos: " + gestionContactos.verTodos());
		
		// Buscar Contacto
		System.out.println("--- Buscar contacto: ---\n" + gestionContactos.buscarNombre("Maria"));
		// Buscar Contacto
		System.out.println("--- Buscar amigo: ---\n" + gestionContactos.buscarNombre("Lucas"));
		// Buscar Apodo
		System.out.println("--- Buscar apodo: ---\n" + gestionContactos.buscarApodo("El pato"));
		// Buscar contactos de empresa
		System.out.println("--- Buscar empresa: ---\n" + gestionContactos.buscarEmpresa("Calderon"));
		for (Contacto contacto : gestionContactos.buscarEmpresa("Calderon")) {
			System.out.println(contacto);
		}

		// Eliminar
		gestionContactos.eliminar(1);
		System.out.println("--- Contactos: " + gestionContactos.verTodos());

	}

}
