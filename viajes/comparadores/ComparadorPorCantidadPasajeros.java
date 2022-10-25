package viajes.comparadores;

import java.util.Comparator;
import viajes.ElementoViaje;

public class ComparadorPorCantidadPasajeros implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje viaje1, ElementoViaje viaje2) {
		return viaje1.getCantidadPasajeros() - (viaje2.getCantidadPasajeros());
	}
	
}