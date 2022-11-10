package peliculas.filtros;

import peliculas.Pelicula;

public class FiltroPorCantidadActores extends Filtro{
	private int cantidadMenor;

	@Override
	public boolean cumple(Pelicula p) {
		// TODO Auto-generated method stub
		return p.cantidadActores()> cantidadMenor;
	}
	
	

}

