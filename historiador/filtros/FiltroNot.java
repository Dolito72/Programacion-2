package historiador.filtros;

import historiador.Documento;

public class FiltroNot extends Filtro{
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}


	@Override
	public boolean cumple(Documento d) {
		return !this.filtroANegar.cumple(d);
		
	}
}




