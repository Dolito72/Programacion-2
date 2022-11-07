package viajes.filtros;

import viajes.ElementoViaje;
import java.time.LocalDate;

public class FiltroPorFecha extends Filtro{
	private LocalDate fechaDada;
	@Override
	public boolean cumple(ElementoViaje viaje) {
		if(viaje.getFechaPago()!=null)
			return viaje.getFechaPago().equals(fechaDada);
		else
			return false;
	}

}
