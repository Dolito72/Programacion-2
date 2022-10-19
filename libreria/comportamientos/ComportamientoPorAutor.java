package libreria.comportamientos;

import libreria.Articulo;
import libreria.Cliente;

public class ComportamientoPorAutor extends Comportamiento {

	@Override
	public boolean leGusta(Articulo a, Cliente c) {
		return c.leGustaAutor(a.getAutor());
	}

}
