package peliculas.filtros;

import peliculas.Actor;
import peliculas.Pelicula;

public class FiltroPorActor extends Filtro {
	private Actor actorBuscado;
	
	public FiltroPorActor(Actor actorBuscado){
		this.actorBuscado = actorBuscado;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.actuo(actorBuscado);
	}

}
