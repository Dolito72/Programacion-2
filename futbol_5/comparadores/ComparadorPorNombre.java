package futbol_5.comparadores;

import java.util.Comparator;
import futbol_5.Socio;

public class ComparadorPorNombre implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareTo(o2.getNombre()) ;
	}
	
}