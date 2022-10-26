
package aseguradora.comparadores;

import java.util.Comparator;
import aseguradora.Seguro;

public class ComparadorPorDni implements Comparator<Seguro>{

	@Override
	public int compare(Seguro s1, Seguro s2) {
		return s1.getDni() - s2.getDni();
	}
	
}