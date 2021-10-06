package es.cfc.models;

public class Persona {

	// Recursos de instancia; existe una copia por cada instancia
	private int id;
	private String nombre;

	// Recurso de clase; SOLO existe una copia y estará en la clase
	private static int contador = 0;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		// this.id = Persona.lastId++; // 0 a 1
		this.id = ++Persona.contador; // 1 a 2
	}

	public static int getContador() {
		// Dentro de un contexto estático
		// no puedo acceder a los recursos de instancia
		// nombre = "Otro"; // No deja acceder
		return contador;
	}

	public String getNombre() {
		// No hay problema desde los recursos
		// de instancia sí se accede a los de clase
		contador = 25; // Aquí si permite
		return nombre;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre;
	}

}
