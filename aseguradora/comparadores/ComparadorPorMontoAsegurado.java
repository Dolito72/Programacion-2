
package aseguradora.comparadores;

import java.util.Comparator;
import aseguradora.Seguro;

public class ComparadorPorMontoAsegurado implements Comparator<Seguro>{

	@Override
	public int compare(Seguro s1, Seguro s2) {
		return s1.calcularMontoAsegurado() - s2.calcularMontoAsegurado();
	}
	
}