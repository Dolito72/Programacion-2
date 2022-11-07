package complejoHotelero.comparadores;


import java.util.Comparator;
import complejoHotelero.Habitacion;

public class ComparadorPorFecha implements Comparator<Habitacion>{

	@Override
	public int compare(Habitacion o1, Habitacion o2) {
		return o1.getFechaOcupacion().compareTo(o2.getFechaOcupacion());
	}

}
