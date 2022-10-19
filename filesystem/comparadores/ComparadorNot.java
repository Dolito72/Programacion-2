package filesystem.comparadores;

import java.util.Comparator;

import filesystem.Archivo;

public class ComparadorNot implements Comparator<Archivo> {
	
	private Comparator<Archivo> comparador;
	
	public ComparadorNot(Comparator<Archivo> comparador) {
		this.comparador = comparador;
	}

	@Override
	public int compare(Archivo a1, Archivo a2) {
		return - this.comparador.compare(a1, a2);
	}

}
