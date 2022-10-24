package futbol_5.comparadores;

import java.util.Comparator;
import futbol_5.Socio;

public class ComparadorCantidadAlquileres implements Comparator<Socio> {
	private String cancha;
	
	public ComparadorCantidadAlquileres(String cancha){
		this.cancha = cancha;
	}
	@Override
	public int compare(Socio o1, Socio o2) {
		if (o1.cantidadTotalAlquilerCancha(cancha) > o2.cantidadTotalAlquilerCancha(cancha))
			return 1;
		else if (o1.cantidadTotalAlquilerCancha(cancha) < o2.cantidadTotalAlquilerCancha(cancha))
			return- 1;
		else
			return 0;
		
	}
}
