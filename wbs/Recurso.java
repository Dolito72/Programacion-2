package wbs;

import java.util.ArrayList;

public class Recurso {
	protected String nombre;
	ArrayList<Elemento> tareas;
	
	public Recurso(String nombre){
		this.nombre = nombre;
		this.tareas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esPosibleAsignar(Elemento tarea){
		for (Elemento e:tareas){
			if ( (tarea.getFechaInicio().isAfter(e.getFechaInicio())) && (tarea.getFechaFin().isBefore(e.getFechaFin() )))
				return false;
		}
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		try{
			Recurso otro = (Recurso) obj;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	public ArrayList<Elemento> listaTareas(){
		ArrayList<Elemento> listaTareas = new ArrayList<>(tareas);
		return listaTareas;
	}
}