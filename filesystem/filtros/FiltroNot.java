package filesystem.filtros;

import filesystem.Archivo;

public class FiltroNot extends Filtro {

	private Filtro filtro;
	
	public FiltroNot(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Archivo archivo) {
		return ! this.filtro.cumple(archivo);
	}

}
