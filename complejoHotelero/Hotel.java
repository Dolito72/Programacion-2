package complejoHotelero;

import java.util.ArrayList;
import java.util.Comparator;

import complejoHotelero.filtros.Filtro;

public class Hotel extends Elemento{
	private ArrayList<Elemento> elementos;
	
	public Hotel(){
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e){
		elementos.add(e);
	}
	@Override
	public int cantidadHabLibres() {
		int cantidadTotal = 0;
		for(Elemento e:elementos)
			cantidadTotal += e.cantidadHabLibres();
		return cantidadTotal;
	}

	@Override
	public int cantidadHab(Turista t) {
		int cantidadTotal = 0;
		for(Elemento e:elementos)
			cantidadTotal += (e.cantidadHab(t));
		return cantidadTotal;
	}

	@Override
	public int cantidadTotalMetros() {
		int cantidadMetrosTotal = 0;
		for (Elemento e:elementos)
			cantidadMetrosTotal += e.cantidadTotalMetros();
		return cantidadMetrosTotal;
	}

	@Override
	public ArrayList<Habitacion> listadoHabitacionesCumplen(Turista t) {
		ArrayList<Habitacion> resultado = new ArrayList<>();
		for (Elemento e:elementos){
			ArrayList<Habitacion> resHijo = e.listadoHabitacionesCumplen(t);
			resultado.addAll(resHijo);
		}
		return resultado;
	}

}
