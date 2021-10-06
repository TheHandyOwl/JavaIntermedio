package es.cfc;

import es.cfc.business.GestionTareas;
import es.cfc.models.Tarea;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionTareas gt = new GestionTareas();
		Tarea[] tareas = new Tarea[10];
		
		tareas[0] = gt.crearTarea(1, "Comprar patatas");
		tareas[1] = gt.crearTarea(2, "Comprar huevos");
		tareas[2] = gt.crearTarea(3, "Comprar cebolla");
		
		tareas[0] = gt.procesarTarea(tareas[0]);
		gt.mostrarTarea(tareas[0]);
		
		tareas[0] = gt.procesarTarea(tareas[0]);
		gt.mostrarTarea(tareas[0]);
	}
	
}
