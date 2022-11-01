
package sistemaComunicados.comparadores;

import java.util.Comparator;

import sistemaComunicados.Empleado;

public class ComparadorPorCantidadNotif implements Comparator<Empleado>{

	@Override
	public int compare(Empleado e0, Empleado e1) {
		return e0.getCantidadNotificaciones() - e1.getCantidadNotificaciones();
	}
	
}