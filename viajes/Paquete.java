package viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import viajes.filtros.Filtro;

public class Paquete extends ElementoViaje {
	ArrayList<ElementoViaje> viajes;
	
	public Paquete(int id, LocalDate fechaPago, String destino, String origen, int costo, String alojamiento, int cantidadPasajeros){
		super(id, fechaPago, destino, origen, costo, alojamiento, cantidadPasajeros);
		this.viajes = new ArrayList<>();
	}
	
	public void addViaje(ElementoViaje viaje){
		if ((viajes.isEmpty()) && (viaje.getCantidadPasajeros()== this.getCantidadPasajeros()))
			viajes.add(viaje);
		else 
			if ((viaje.getCantidadPasajeros()== this.getCantidadPasajeros()) && (viaje.getOrigen().equals(this.getDestino()))){
				viajes.add(viaje);
			}
	}
	@Override
	public LocalDate getFechaPago() {
		LocalDate ultimaFechaPago = null;
		for (ElementoViaje e:viajes)
			if (e.getFechaPago().isAfter(ultimaFechaPago))
					ultimaFechaPago = e.getFechaPago();
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

	@Override
	public int compareTo(LocalDate o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public  ArrayList<ElementoViaje> ListadoViajes(Filtro f, Comparator comp){
		ArrayList<ElementoViaje> resultado = new ArrayList<>();
			for (ElementoViaje v:viajes)
				if (f.cumple(v))
				resultado.add(this);
			else
				for (ElementoViaje e:viajes)
					if (f.cumple(e))
						resultado.add(e);
		Collections.sort(resultado, comp);
		return resultado;
	}


}