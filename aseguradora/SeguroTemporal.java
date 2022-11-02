package aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

import aseguradora.filtros.Filtro;

public class SeguroTemporal extends Seguro {
	private LocalDate inicio;
	private LocalDate fin;
	private Seguro contenido;

	public SeguroTemporal(LocalDate inicio, LocalDate fin, Seguro contenido) {
		this.inicio = inicio;
		this.fin = fin;
		this.contenido = contenido;
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

	public Seguro getContenido() {
		return contenido;
	}


	public void setContenido(Seguro contenido) {
		this.contenido = contenido;
	}

	public boolean estaVigente(){
		LocalDate fechaActual = LocalDate.now();
		if (fechaActual.isAfter(inicio) && fechaActual.isBefore(fin)){
			return true;
		}
		return false;
	}

	@Override
	public int calcularMontoAsegurado() {
		if(this.estaVigente())
			return contenido.calcularMontoAsegurado();
		return 0;
	}

	@Override
	public int getNumeroPoliza() {
		return contenido.getNumeroPoliza();
	}

	@Override
	public double getCosto() {
		if(this.estaVigente())
			return contenido.getCosto();
		return 0.0;
	}

	@Override
	public ArrayList<SeguroSimple> buscarSeguros(Filtro f) {
		if (this.estaVigente())
				return this.contenido.buscarSeguros(f);
		return new ArrayList<>();
	}

	@Override
	public int getDni() {
		return this.contenido.getDni();
	}


}
