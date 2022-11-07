package complejoHotelero.filtros;

import complejoHotelero.Habitacion;

import farmacia.Medicamento;

public class FiltroNot extends Filtro {
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}
	@Override
	public boolean cumple(Habitacion h) {
		return !this.filtroANegar.cumple(h);
	}

}

