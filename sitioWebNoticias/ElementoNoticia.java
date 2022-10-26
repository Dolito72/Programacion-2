package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.filtros.Filtro;

public abstract class ElementoNoticia {
	
	public abstract int getCantidadNoticias();
	public abstract ElementoNoticia copiar(Filtro f);
	public abstract String toString();
	public abstract ArrayList<ElementoNoticia> listadoNoticias (Filtro f);
	public abstract ArrayList<String> mapaDeSitio();
}