package historiador.filtros;

import historiador.Documento;

public class FiltroFrase extends Filtro{
	private String fraseBuscada;
	
	public FiltroFrase(String fraseBuscada){
		this.fraseBuscada = fraseBuscada;
	}

	@Override
	public boolean cumple(Documento d) {
		return d.getTitulo().contains(fraseBuscada);
	}

	
}
