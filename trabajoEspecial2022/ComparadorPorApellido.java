package trabajoEspecial2022;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Alumno aux = (Alumno)((Nodo)o1).getObjeto();
		Alumno baux = (Alumno)o2;
		return aux.getApellido().compareTo(baux.getApellido());
	}

}
