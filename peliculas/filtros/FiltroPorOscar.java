package peliculas.filtros;

import peliculas.Pelicula;

public class FiltroPorOscar extends Filtro{
	private int cantidadMenor;
	
	public FiltroPorOscar(int cantidadMenor){
		this.cantidadMenor = cantidadMenor;
	}

	@Override
	public boolean cumple(Pelicula p) {
		
		return p.getcantidadOscars()> cantidadMenor;
	}

}
