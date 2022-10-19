package futbol_5.comparadores;

import java.util.Comparator;

import futbol_5.Alquiler;
import futbol_5.Socio;


public class ComparadorCantidadAlquileres implements Comparator<Socio> {
	private String cancha;
	
	public ComparadorCantidadAlquileres(String cancha){
		this.cancha = cancha;
	}
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.cantidadTotalAlquilerCancha(cancha) - o2.cantidadTotalAlquilerCancha(cancha);
	}

	
}
