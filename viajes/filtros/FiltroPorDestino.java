package viajes.filtros;

import viajes.ElementoViaje;

public class FiltroPorDestino extends Filtro{
	private String destinoBuscado;

	@Override
	public boolean cumple(ElementoViaje viaje) {
		return viaje.getDestino().equals(destinoBuscado);
	}

}
