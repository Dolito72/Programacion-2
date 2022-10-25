package viajes.comparadores;

import java.util.Comparator;
import viajes.ElementoViaje;

public class ComparadorPorId implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje viaje1, ElementoViaje viaje2) {
		return viaje1.getId() - (viaje2.getId());
	}
	
}