package viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import viajes.filtros.Filtro;
import viajes.comparadores.*;
public class Viaje extends ElementoViaje{
	protected LocalDate fechaPago;
	protected String destino;
	protected String origen;
	protected int costo;
	protected String alojamiento;
	
	
	public Viaje(int id,int cantidadPasajeros, LocalDate fechaPago, String destino, String origen, int costo,
			String alojamiento) {
		super(id, cantidadPasajeros);
		this.fechaPago = fechaPago;
		this.destino = destino;
		this.origen = origen;
		this.costo = costo;
		this.alojamiento = alojamiento;
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



