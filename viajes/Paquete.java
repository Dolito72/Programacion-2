package viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import viajes.filtros.Filtro;

public class Paquete extends ElementoViaje {
	ArrayList<ElementoViaje> viajes;
	
	public Paquete(int id, LocalDate fechaPago, String destino, String origen, int costo, String alojamiento, 
	int cantidadPasajeros){
		super(id, fechaPago, destino, origen, costo, alojamiento, cantidadPasajeros);
		this.viajes = new ArrayList<>();
	}
	
	public void addViaje(ElementoViaje viaje){
		if ((viajes.isEmpty()) && (viaje.getCantidadPasajeros()== this.getCantidadPasajeros()))
			viajes.add(viaje);
		else 
			if ((viaje.getCantidadPasajeros()== this.getCantidadPasajeros()) && (viaje.getOrigen().equals(viajes.get(viajes.size()-1).getDestino()))){
				viajes.add(viaje);
			}
	}
	@Override
	public LocalDate getFechaPago() {
		LocalDate ultimaFechaPago = null;
		for (ElementoViaje e:viajes){
			LocalDate fechaHija = e.getFechaPago();
			if (fechaHija == null)
				return null;
			if (ultimaFechaPago == null || fechaHija.isAfter(ultimaFechaPago))
					ultimaFechaPago = fechaHija;
		}
		return ultimaFechaPago;
	}

	@Override
	public String getDestino() {
		return viajes.get(viajes.size()-1).getDestino();
	}

	@Override
	public String getOrigen() {
		return viajes.get(0).getOrigen();
	}

	@Override
	public int getCosto() {
		int costoTotal = 0;
		for (ElementoViaje v:viajes)
			costoTotal += v.getCosto();
		return costoTotal;
	}

	@Override
	public String getAlojamiento() {
		return alojamiento;
	}

	public  ArrayList<ElementoViaje> buscarViajes(Filtro f){
		ArrayList<ElementoViaje> resultado = new ArrayList<>();
			if (f.cumple(this))
				resultado.add(this);
			else
				for (ElementoViaje e:viajes){
					ArrayList<ElementoViaje> resultadoHijo = e.buscarViajes(f);
					resultado.addAll(resultadoHijo);
				}
		
		return resultado;
	}
}