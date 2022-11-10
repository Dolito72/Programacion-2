package complejoHotelero;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import complejoHotelero.filtros.Filtro;

public class Habitacion extends Elemento {
	private ArrayList<String> caracteristicas;
	private int metros;
	private int cantCamas;
	private LocalDate fechaOcupacion;
	private Turista turista;
	private boolean aceptaMascota;
	
	public Habitacion (int metros, int cantCamas, LocalDate fechaOcupacion, Turista turista,
			boolean aceptaMascota){
	
		this.caracteristicas = new ArrayList<String>();
		this.metros = metros;
		this.cantCamas = cantCamas;
		this.fechaOcupacion = fechaOcupacion;
		this.turista = null;
		this.aceptaMascota = aceptaMascota;
	}
	
	
	public boolean isAceptaMascota() {
		return aceptaMascota;
	}

	public void setAceptaMascota(boolean aceptaMascota) {
		this.aceptaMascota = aceptaMascota;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public int getCantCamas() {
		return cantCamas;
	}

	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}

	public LocalDate getFechaOcupacion() {
		return fechaOcupacion;
	}

	public void setFechaOcupacion(LocalDate fechaOcupacion) {
		this.fechaOcupacion = fechaOcupacion;
	}

	public Turista getTurista() {
		return turista;
	}

	public void setTurista(Turista turista) {
		if(!this.estaDisponible() && ((Turista) turista).cumpleRequerimiento(this)){
			this.turista = turista;
		}
	}

	public void agregarCaracteristica(String c){
		if(!this.caracteristicas.contains(c))
			caracteristicas.add(c);
	}
	
	public boolean tieneCaracteristica(String caracteristica){
		return this.caracteristicas.contains(caracteristica);
	}
	public boolean estaDisponible(){
		if (this.turista == null)
			return true;
		else
			return false;
	}
	
	@Override
	public int cantidadHabLibres() {
		if(this.estaDisponible())
			return 1;
		else
			return 0;
	}

	@Override
	public int cantidadHab(Turista t) {
		if(t.cumpleRequerimiento(this))
			return 1;
		else
			return 0;
	}

	@Override
	public int cantidadTotalMetros() {
		return this.metros;
	}

	@Override
	public ArrayList<Habitacion> listadoHabitacionesCumplen(Turista t) {
		ArrayList<Habitacion> resultado = new ArrayList<>();
		if (this.estaDisponible() && (t.cumpleRequerimiento(this)))
			resultado.add(this);
		return null;
	}

}
