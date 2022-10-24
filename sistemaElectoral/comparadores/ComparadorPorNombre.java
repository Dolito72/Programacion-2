package sistemaElectoral.comparadores;

import java.util.Comparator;
import sistemaElectoral.Candidato;

public class ComparadorPorNombre implements Comparator<Candidato>{
	
	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}