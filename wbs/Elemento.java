package wbs;

import java.time.LocalDate;
import java.util.ArrayList;

import wbs.filtros.Filtro;

public abstract class Elemento{
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	
	public Elemento(LocalDate fechaInicio, LocalDate fechaFin){
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public abstract LocalDate getFechaInicio();
	public abstract LocalDate getFechaFin();

	public abstract ArrayList<Tarea> buscarTareas(Filtro f);
	public abstract ArrayList<Recurso> getRecursos();
}