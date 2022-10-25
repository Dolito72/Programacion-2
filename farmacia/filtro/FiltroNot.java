package filtro;

import farmacia.Medicamento;

public class FiltroNot extends Filtro {
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}
	@Override
	public boolean cumple(Medicamento medicamento) {
		return !this.filtroANegar.cumple(medicamento);
	}

}
