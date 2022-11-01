package wbs;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import wbs.filtros.Filtro;

public class Tarea extends Elemento{
	ArrayList<Recurso> recursos;
	private LocalDate fechaInicioEstimada;
	private LocalDate fechaFinEstimada;
	private String estado;
	
	public Tarea(LocalDate fechaInicio, LocalDate fechaFin){
		super(fechaInicio, fechaFin);
		this.fechaInicioEstimada = fechaInicioEstimada;
		this.fechaFinEstimada = fechaFinEstimada;
	}
	
	public LocalDate getFechaInicioEstimada() {
		return fechaInicioEstimada;
	}

	public void setFechaInicioEstimada(LocalDate fechaInicioEstimada) {
		this.fechaInicioEstimada = fechaInicioEstimada;
	}

	public LocalDate getFechaFinEstimada() {
		return fechaFinEstimada;
	}

	public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
		this.fechaFinEstimada = fechaFinEstimada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Period getDuracionEstimada(){
		Period duracion = Period.between(this.getFechaInicioEstimada(), this.getFechaFinEstimada());
		return duracion;
	}
	
	public ArrayList<Recurso> listaRecursos(){
		ArrayList<Recurso> listaRecursos = new ArrayList<>(recursos);
		return listaRecursos;
	}

	@Override
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	@Override
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void addRecurso (Recurso r){
		if (r.esPosibleAsignar(this))
			this.recursos.add(r);
	}
	public boolean tieneRecurso(Recurso r){
		return recursos.contains(r);
	}
	
	public ArrayList<Recurso> getRecursos(){
		ArrayList<Recurso> copia = new ArrayList<>(recursos);
		return copia;
	}
	@Override
	public ArrayList<Tarea> buscarTareas(Filtro f) {
		ArrayList<Tarea> resultado = new ArrayList<>();
			if(f.cumple(this)){
				resultado.add(this);
			}
		return resultado;
	}

}
