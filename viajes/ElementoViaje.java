package viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import viajes.filtros.Filtro;
import viajes.comparadores.*;

public abstract class ElementoViaje {
	protected int id;
	protected int cantidadPasajeros;
	
	public ElementoViaje(int id, int cantidadPasajeros){
		this.id = id;
		
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public abstract LocalDate getFechaPago();
	public abstract String getDestino();
	public abstract String getOrigen();
	public abstract int getCosto();
	public abstract ArrayList<ElementoViaje> buscarViajes(Filtro f);
	
	public ArrayList<ElementoViaje>buscarOrdenado(Filtro f,Comparator comp){
		ArrayList<ElementoViaje> resultado = this.buscarViajes(f);
		Collections.sort(resultado, comp);
		return resultado;
		
	}
	
	
	
	
}