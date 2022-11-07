package complejoHotelero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import complejoHotelero.filtros.Filtro;

public abstract class Elemento{
	protected Comparator<Habitacion> comparador;
	
	public Elemento(Comparator<Habitacion> comparador){
		this.comparador = comparador;
	}
	
	public Comparator<Habitacion> getComparador() {
		return comparador;
	}

	public void setComparador(Comparator<Habitacion> comparador) {
		this.comparador = comparador;
	}
	public abstract int cantidadHabLibres();
	public abstract int cantidadHab(Filtro f);
	public abstract int cantidadTotalMetros();
	public abstract ArrayList<Habitacion> listadoHabitacionesCumplen(Filtro f);
	public ArrayList<Habitacion> listadoHabitacionesOrdenado(Filtro f, Comparator comp){
		ArrayList <Habitacion> resultado =  this.listadoHabitacionesCumplen(f);
		Collections.sort(resultado, comp);
		return resultado;
		
	}
	
}