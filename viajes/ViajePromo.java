package viajes;

import java.time.LocalDate;

public class ViajePromo extends Viaje{
	private LocalDate inicio;
	private LocalDate fin;
	private double descuento;
	
	public ViajePromo(int id, LocalDate fechaPago, String destino, String origen, int costo, String alojamiento, int cantidadPasajeros) {
		super(id, fechaPago, destino, origen, costo, alojamiento, cantidadPasajeros);
		this.inicio = inicio;
		this.fin = fin;
		this.descuento = descuento;
	}
	

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	
	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public boolean entreFechas(LocalDate inicio, LocalDate fin){
		if (fechaPago.isAfter(inicio) && fechaPago.isBefore(fin))
			return true;
		else
			return false;
		
	}
	@Override
	public int getCosto() {
		if (this.entreFechas(inicio, fin))
			return (int) (this.costo - this.costo * this.getDescuento() / 100);
		else
		return costo;
	}
	
	
	
}
