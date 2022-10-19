package futbol_5.comparadores;

import java.util.Comparator;


import futbol_5.Socio;
public class ComparadorPorCuotaPaga implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return Boolean.compare(o1.isCuotaPaga(), o2.isCuotaPaga());
	}
	

}
