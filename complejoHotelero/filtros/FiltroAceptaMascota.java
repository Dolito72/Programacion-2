package complejoHotelero.filtros;

import complejoHotelero.Habitacion;

public class FiltroAceptaMascota extends Filtro {

	@Override
	public boolean cumple(Habitacion h) {
		return h.isAceptaMascota();
	}

}
