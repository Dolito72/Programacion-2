package sistemaArchivos.comparadores;

import java.util.Comparator;
import sistemaArchivos.Archivo;

public class ComparadorPorTamanio implements Comparator<Archivo> {

	@Override
	public int compare(Archivo o1, Archivo o2) {
		return o1.getTamanio() - o2.getTamanio();
	}

}
