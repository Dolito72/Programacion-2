package viajes.filtros;

import viajes.ElementoViaje;

public class FiltroPorOrigen extends Filtro {
	private String origenBuscado;

	@Override
	public boolean cumple(ElementoViaje viaje) {
		return viaje.getOrigen().equals(origenBuscado);
	}
}
