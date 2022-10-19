package libreria.comportamientos;



import libreria.Articulo;
import libreria.Cliente;

public class ComportamientoGustaTodo extends Comportamiento {

	@Override
	public boolean leGusta(Articulo a, Cliente c) {
		return true;
	}

}
