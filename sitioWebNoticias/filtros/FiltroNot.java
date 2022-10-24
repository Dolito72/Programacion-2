package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public class FiltroNot extends Filtro{
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}


	@Override
	public boolean cumple(Noticia n) {
		return !this.filtroANegar.cumple(n);
		
	}
}




