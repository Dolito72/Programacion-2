package filesystem.filtros;

import filesystem.Archivo;

public class FiltroTamanio extends Filtro {

	private int tamanioMax;
	
	public FiltroTamanio(int tamanioMax) {
		this.tamanioMax = tamanioMax;
	}
	
	@Override
	public boolean cumple(Archivo archivo) {
		return archivo.getTamanio() < this.tamanioMax;
	}

}
