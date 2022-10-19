package futbol_5.comparadores;

import java.util.Comparator;
import futbol_5.Socio;

public class ComparadorPorEdad implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad() - o2.getEdad();
	}
}
