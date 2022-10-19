package libreria.filtros;
import libreria.Articulo;

public class FiltroPrecio extends Filtro {
	private double precioMax;

	public FiltroPrecio(double precioMax) {
		this.precioMax = precioMax;
	}
	
	public boolean cumple(Articulo articulo) {
		return articulo.getPrecio() < this.precioMax;
	}

}

