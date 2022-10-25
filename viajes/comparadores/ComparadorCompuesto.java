package viajes.comparadores;

import java.util.Comparator;
import viajes.ElementoViaje;;

public class ComparadorCompuesto implements Comparator<ElementoViaje>{
	Comparator<ElementoViaje> comp1;
	Comparator<ElementoViaje> comp2;
	
	public ComparadorCompuesto(Comparator<ElementoViaje> comp1, Comparator<ElementoViaje> comp2){
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(ElementoViaje o1, ElementoViaje o2) {
		int resultado;
		resultado = comp1.compare(o1, o2);
			if(resultado == 0);
				comp2.compare(o1, o2);
			return resultado;
	}



}
