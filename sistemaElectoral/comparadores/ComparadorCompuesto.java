package sistemaElectoral.comparadores;

import java.util.Comparator;
import sistemaElectoral.Candidato;

public class ComparadorCompuesto implements Comparator<Candidato>{
	Comparator<Candidato> comp1;
	Comparator<Candidato> comp2;
	
	public ComparadorCompuesto(Comparator<Candidato> comp1, Comparator<Candidato> comp2){
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(Candidato o1, Candidato o2) {
		int resultado;
		resultado = comp1.compare(o1, o2);
			if(resultado == 0);
				comp2.compare(o1, o2);
			return resultado;
	}
}
