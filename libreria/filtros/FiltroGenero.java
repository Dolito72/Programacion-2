package libreria.filtros;

import libreria.Articulo;

public class FiltroGenero extends Filtro {
	private String generoBuscado;
	
	public FiltroGenero(String generoBuscado) {
		this.generoBuscado = generoBuscado;
	}
	
	@Override
	public boolean cumple(Articulo articulo) {
		return articulo.tieneGenero(this.generoBuscado);
	}
}
