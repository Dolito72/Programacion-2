package viajes.filtros;

import viajes.ElementoViaje;

public class FiltroNot extends Filtro{
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}


	@Override
	public boolean cumple(ElementoViaje v) {
		return !this.filtroANegar.cumple(v);
		
	}
}




