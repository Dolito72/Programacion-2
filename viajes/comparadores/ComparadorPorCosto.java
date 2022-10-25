package viajes.comparadores;

import java.util.Comparator;
import viajes.ElementoViaje;

public class ComparadorPorCosto implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje viaje1, ElementoViaje viaje2) {
		return viaje1.getCosto() - (viaje2.getCosto());
	}
	
}