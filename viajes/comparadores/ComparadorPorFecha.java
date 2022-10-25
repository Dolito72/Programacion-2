package viajes.comparadores;

import java.util.Comparator;
import viajes.ElementoViaje;

public class ComparadorPorFecha implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje viaje1, ElementoViaje viaje2) {
		return viaje1.getFechaPago().compareTo(viaje2.getFechaPago());
	}
	
}