package complejoHotelero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import complejoHotelero.filtros.Filtro;

public abstract class Elemento{
	
	public abstract int cantidadHabLibres();
	public  int cantidadHab(Turista t){
		return this.listadoHabitacionesCumplen(t).size();
	}
	public abstract int cantidadTotalMetros();
	public abstract ArrayList<Habitacion> listadoHabitacionesCumplen(Turista t);
	public ArrayList<Habitacion> listadoHabitacionesOrdenado(Turista t, Comparator<Habitacion> comp){
		ArrayList <Habitacion> resultado =  this.listadoHabitacionesCumplen(t);
		Collections.sort(resultado, comp);
		return resultado;
		
	}
	
}