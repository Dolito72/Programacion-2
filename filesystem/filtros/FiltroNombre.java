package filesystem.filtros;

import filesystem.Archivo;

public class FiltroNombre extends Filtro {

	private String nombreBuscado;
	
	public FiltroNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}
	
	@Override
	public boolean cumple(Archivo archivo) {
		return archivo.getNombre().contains(this.nombreBuscado);
	}

}
