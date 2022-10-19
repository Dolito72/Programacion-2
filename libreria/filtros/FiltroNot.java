package libreria.filtros;
import libreria.Articulo;

public class FiltroNot extends Filtro{
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}

	@Override
	public boolean cumple(Articulo articulo) {
		return !this.filtroANegar.cumple(articulo);
	}
}
