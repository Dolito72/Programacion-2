package viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import viajes.filtros.Filtro;
import viajes.comparadores.*;

public abstract class ElementoViaje implements Comparable<LocalDate>{
	protected int id;
	protected LocalDate fechaPago;
	protected String destino;
	protected String origen;
	protected int costo;
	protected String alojamiento;
	protected int cantidadPasajeros;
	
	public ElementoViaje(int id, LocalDate fechaPago, String destino, String origen, int costo, String alojamiento, int cantidadPasajeros){
		this.id = id;
		this.fechaPago = fechaPago;
		this.destino = destino;
		this.origen = origen;
		this.costo = costo;
		this.alojamiento = alojamiento;
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

	public abstract String getAlojamiento();
	public abstract LocalDate getFechaPago();
	public abstract String getDestino();
	public abstract String getOrigen();
	public abstract int getCosto();
	public abstract ArrayList<ElementoViaje> ListadoViajes(Filtro f, Comparator p);
	
	
	
	
}