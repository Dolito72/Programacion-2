package sistemaArchivos.comparadores;

import java.util.Comparator;

import sistemaArchivos.Archivo;

public class ComparadorPorNombre implements Comparator<Archivo>{

@Override
	public int compare(Archivo o1, Archivo o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}