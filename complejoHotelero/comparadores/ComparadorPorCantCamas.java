
package complejoHotelero.comparadores;
import java.util.Comparator;

import complejoHotelero.Habitacion;

public class ComparadorPorCantCamas implements Comparator<Habitacion>{

	@Override
	public int compare(Habitacion h0, Habitacion h1) {
		return h0.getCantCamas() - h1.getCantCamas();
	}
	
}