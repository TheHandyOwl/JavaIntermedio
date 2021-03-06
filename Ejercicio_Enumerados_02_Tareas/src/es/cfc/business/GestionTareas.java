package es.cfc.business;

import es.cfc.models.Estado;
import es.cfc.models.Tarea;

public class GestionTareas {
	
	public GestionTareas() {
		// TODO Auto-generated constructor stub
	}

	public Tarea crearTarea(int id, String descripcion) {
		Tarea tarea = new Tarea(id, descripcion, Estado.NUEVA);
		System.out.println("Se ha creado la tarea: '" + tarea.getDescription() +
				//"' y está en estado '" + tarea.getEstado() + "'"); // 'NUEVA'
				"' y está en estado '" + tarea.getEstado().getEstado() + "'"); // 'nueva'
		
		return tarea;
	}
	
	public void mostrarTarea(Tarea tarea) {
		System.out.println("--- Tarea ---");
		System.out.println(tarea.toString());
		System.out.println("--- ---");
	}
	
	public Tarea procesarTarea(Tarea tarea) {
		Estado estado = tarea.getEstado();
		
		if (estado == Estado.NUEVA) {
			tarea.setEstado(Estado.EN_PROCESO);
		} else {
			tarea.setEstado(Estado.FINALIZADA);
		}
		
		return tarea;
	}
	
}
