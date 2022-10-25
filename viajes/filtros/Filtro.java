package viajes.filtros;

import viajes.ElementoViaje;

public abstract class Filtro{
	
	public abstract boolean cumple(ElementoViaje viaje);
}
