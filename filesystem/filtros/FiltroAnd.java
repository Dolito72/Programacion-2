package filesystem.filtros;

import filesystem.Archivo;

public class FiltroAnd extends Filtro {

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(Archivo archivo) {
		return this.f1.cumple(archivo) && this.f2.cumple(archivo);
	}

}
