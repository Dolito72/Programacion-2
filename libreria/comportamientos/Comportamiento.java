package libreria.comportamientos;

import libreria.Articulo;
import libreria.Cliente;

public abstract class Comportamiento {
	
	public abstract boolean leGusta(Articulo a, Cliente c);

}
