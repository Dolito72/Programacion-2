
package sistemaCensos.comparadores;

import java.util.Comparator;

import  sistemaCensos.Comarca;

public class ComparadorPorNombre implements Comparator<Comarca>{

	@Override
	public int compare(Comarca c1, Comarca c2) {
		return c1.getNombre().compareTo(c2.getNombre());
	}
	
}