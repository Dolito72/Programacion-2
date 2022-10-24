
package filesystem.comparadores;

import java.util.Comparator;

import filesystem.Archivo;

public class ComparadorAnd implements Comparator<Archivo> {

	private Comparator<Archivo> c1;
	private Comparator<Archivo> c2;
	
	public ComparadorAnd(Comparator<Archivo> c1, Comparator<Archivo> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	/*
	 * Recibe dos archivos (a1 y a2) y los compara.
	 * Primero compara mediante el comparador c1.
	 * Si el comparador c1 retorna 0 (es decir, dice que son iguales)
	 * entonces compara por el comparador c2.
	 */
	@Override
	public int compare(Archivo a1, Archivo a2) {
		int resultado = this.c1.compare(a1, a2);
		if (resultado == 0)
			resultado = this.c2.compare(a1, a2);
		return resultado;
	}

}
