package futbol_5.comparadores;

import java.util.Comparator;
import futbol_5.Socio;

public class ComparadorPorApellido implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}

}
