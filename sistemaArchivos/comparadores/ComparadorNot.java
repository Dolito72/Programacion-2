package sistemaArchivos.comparadores;

import java.util.Comparator;
import sistemaArchivos.Elemento;

public class ComparadorNot implements Comparator<Elemento>{
	private Comparator<Elemento> comp1;
	
	public ComparadorNot (Comparator<Elemento> comp1){
		this.comp1 = comp1;
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		int resultado = comp1.compare(o1, o2);
			return resultado * -1;
	}
}
