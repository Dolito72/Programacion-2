
package aseguradora.comparadores;

import java.util.Comparator;
import aseguradora.Seguro;

public class ComparadorPorNumeroPoliza implements Comparator<Seguro>{

	@Override
	public int compare(Seguro s1, Seguro s2) {
		return s1.numeroPoliza() - s2.numeroPoliza();
	}
	
}