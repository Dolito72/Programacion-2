package viajes.filtros;

import viajes.ElementoViaje;
import java.time.LocalDate;

public class FiltroPorFecha extends Filtro{
	@Override
	public boolean cumple(ElementoViaje viaje) {
		return viaje.getFechaPago().equals(LocalDate.of(2022, 5, 25));
	
	}

}
