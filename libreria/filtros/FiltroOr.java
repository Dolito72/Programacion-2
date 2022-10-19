package libreria.filtros;
import libreria.Articulo;

public class FiltroOr extends Filtro{
	Filtro filtro1;
	Filtro filtro2;
	
	public FiltroOr(Articulo articulo){
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}

	@Override
	public boolean cumple(Articulo articulo) {
		return this.filtro1.cumple(articulo) || this.filtro2.cumple(articulo);
	}
	
	
}
