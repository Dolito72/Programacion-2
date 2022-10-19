package libreria.filtros;

import libreria.Articulo;

public class FiltroAutor extends Filtro {
	private String autorBuscado;
	
	public FiltroAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}
	
	@Override
	public boolean cumple(Articulo articulo) {
		return articulo.getAutor().equals(this.autorBuscado);
	}

}
