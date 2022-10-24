package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public abstract class Filtro{
	
	public abstract boolean cumple(Noticia n);
}