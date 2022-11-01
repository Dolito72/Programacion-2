
package aseguradora.comparadores;

import java.util.Comparator;

import aseguradora.Seguro;
import aseguradora.SeguroSimple;

public class ComparadorPorDni implements Comparator<SeguroSimple>{

	@Override
	public int compare(SeguroSimple s1, SeguroSimple s2) {
		return s1.getDni() - s2.getDni();
	}
	
}