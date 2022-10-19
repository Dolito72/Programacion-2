package futbol_5.comparadores;

import java.util.Comparator;
import futbol_5.Socio;

public class ComparadorCompuesto implements Comparator<Socio>{
	private Comparator<Socio> comp1;
	private Comparator<Socio>comp2;
	
	public ComparadorCompuesto(Comparator<Socio> comp1, Comparator<Socio> comp2){
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(Socio o1, Socio o2) {
		int resultado = comp1.compare(o1, o2);
			if (resultado == 0)
				return comp2.compare(o1, o2);
			return resultado;
	}
}
