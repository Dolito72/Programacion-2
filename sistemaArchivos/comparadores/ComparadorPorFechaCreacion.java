package sistemaArchivos.comparadores;

import java.util.Comparator;
import sistemaArchivos.Elemento;

public class ComparadorPorFechaCreacion implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
	}

}