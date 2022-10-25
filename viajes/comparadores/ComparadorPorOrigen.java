package viajes.comparadores;

import java.util.Comparator;

import viajes.ElementoViaje;
public class ComparadorPorOrigen implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje viaje1, ElementoViaje viaje2) {
		return viaje1.getOrigen().compareTo(viaje2.getOrigen());
	}
	
}