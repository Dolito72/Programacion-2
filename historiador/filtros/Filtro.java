package historiador.filtros;

import historiador.Documento;

public abstract class Filtro{
	
	public abstract boolean cumple(Documento d);
}