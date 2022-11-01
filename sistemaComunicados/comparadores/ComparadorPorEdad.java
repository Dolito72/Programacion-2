package sistemaComunicados.comparadores;

import java.util.Comparator;

import sistemaComunicados.Empleado;

public class ComparadorPorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
