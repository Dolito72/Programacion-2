package viajes;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Comparator;
import viajes.filtros.Filtro;
import viajes.comparadores.*;
public class Viaje extends ElementoViaje{
	private double descuento;
	
	public Viaje(int id, LocalDate fechaPago, String destino, String origen, int costo, double descuento, String alojamiento, int cantidadPasajeros) {
		super(id, fechaPago, destino, origen, id, alojamiento, cantidadPasajeros);
		this.descuento = descuento;
	}

	public double getDescuento(){
		return descuento;
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
		LocalDate inicio = null, fin = null;
		if (this.entreFechas(inicio, fin))
			return (int) (this.costo - this.costo * this.getDescuento() / 100);
		else
		return costo;
	}

	@Override
	public String getAlojamiento() {
		return alojamiento;
	}

	public  ArrayList<ElementoViaje> ListadoViajes(Filtro f, Comparator p){
		ArrayList<ElementoViaje> resultado = new ArrayList<>();
			if (f.cumple(this))
				resultado.add(this);
			
		return resultado;
	}
	@Override
	public int compareTo(LocalDate o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
