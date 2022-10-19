package filesystem.comparadores;

import java.util.Comparator;

import filesystem.Archivo;

public class ComparadorPorNombre implements Comparator<Archivo> {

	
	@Override
	public int compare(Archivo a1, Archivo a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}

}
