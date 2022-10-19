package libreria.comportamientos;

import libreria.Articulo;
import libreria.Cliente;

public class ComportamientoExigente extends ComportamientoPorAutor {
	
	@Override
	public boolean leGusta(Articulo a, Cliente c) {
		if (super.leGusta(a, c)) {
			// Busco algun genero que le guste
			for (int i = 0; i < c.getGenerosPreferidos().size(); i++)
				if (a.tieneGenero(c.getGenerosPreferidos().get(i)))
					return true;
		}
		
		return false;
	}

}
