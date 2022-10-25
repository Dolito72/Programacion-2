package viajes;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Comparator;
import viajes.filtros.Filtro;
import viajes.comparadores.*;
public class Viaje extends ElementoViaje{

	public Viaje(int id, LocalDate fechaPago, String destino, String origen, int costo,String alojamiento, int cantidadPasajeros) {
		super(id, fechaPago, destino, origen, id, alojamiento, cantidadPasajeros);
		
	}

	@Override
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	@Override
	public String getDestino() {
		return destino;
	}

	@Override
	public String getOrigen() {
		return origen;
	}
	
	public boolean entreFechas(LocalDate inicio, LocalDate fin){
		if (fechaPago.isAfter(inicio) && fechaPago.isBefore(fin))
			return true;
		else
			return false;
		
	}
	@Override
	public int getCosto() {
		return costo;
	}

	@Override
	public String getAlojamiento() {
		return alojamiento;
	}
	@Override
	public  ArrayList<ElementoViaje> buscarViajes(Filtro f){
		ArrayList<ElementoViaje> resultado = new ArrayList<>();
			if (f.cumple(this))
				resultado.add(this);
		return resultado;
	}

}



