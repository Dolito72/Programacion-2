package sistemaElectoral.comparadores;

import java.util.Comparator;
import sistemaElectoral.Candidato;

public class ComparadorPorAgrupacion implements Comparator<Candidato> {

		@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getAgrupacion().compareTo(o2.getAgrupacion());
	}
}
