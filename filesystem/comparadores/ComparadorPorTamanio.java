package filesystem.comparadores;

import java.util.Comparator;

import filesystem.Archivo;

public class ComparadorPorTamanio implements Comparator<Archivo> {

	@Override
	public int compare(Archivo a1, Archivo a2) {

		if (a1.getTamanio() > a2.getTamanio())
			return 1;
		else if (a1.getTamanio() < a2.getTamanio())
			return -1;
		else
			return 0;
		
		//return a1.getTamanio() - a2.getTamanio();
		
		//return Integer.compare(a1.getTamanio(), a2.getTamanio());
		
		
	}

}
