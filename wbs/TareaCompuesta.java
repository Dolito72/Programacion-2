package wbs;

import java.time.LocalDate;
import java.util.ArrayList;

import wbs.filtros.Filtro;

public class TareaCompuesta extends Elemento {
	private ArrayList<Elemento> tareas;
	
	public TareaCompuesta (LocalDate fechaInicio, LocalDate fechaFin){
		super(fechaInicio, fechaFin);
		this.tareas = new ArrayList<>();
	}
	
	public void addTarea (Elemento tarea){
		this.tareas.add(tarea);
	}
	@Override
	public LocalDate getFechaInicio() {
		LocalDate fechaTemprana = tareas.get(0).getFechaInicio();
		for (Elemento e: tareas)
			if (e.getFechaInicio().isBefore(fechaTemprana))
				fechaTemprana = e.getFechaInicio();
		return fechaTemprana;
	}

	@Override
	public LocalDate getFechaFin() {
		LocalDate fecha = tareas.get(0).getFechaFin();
		for (Elemento e:tareas)
			if (e.getFechaFin().isAfter(fecha))
				fecha = e.getFechaFin();
		return fecha;
	}

	@Override
	public ArrayList<Recurso> getRecursos() {
		ArrayList<Recurso> listaRecursos = new ArrayList<>();
		for (Elemento e: tareas){
			ArrayList<Recurso> listaHija = e.getRecursos();
			for (Recurso h: listaHija){
				if (!listaHija.contains(h))
					listaRecursos.add(h);
			}
		}
		return listaRecursos;
	}

	@Override
	public ArrayList<Tarea> buscarTareas(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
