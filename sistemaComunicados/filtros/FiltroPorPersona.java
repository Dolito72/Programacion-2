package sistemaComunicados.filtros;

import sistemaComunicados.Empleado;
import sistemaComunicados.Notificacion;

public class FiltroPorPersona extends Filtro{
	private Empleado empleadoBuscado;
	
	public FiltroPorPersona (Empleado empleadoBuscado){
		this.empleadoBuscado = empleadoBuscado;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return n.getNombre().equals(empleadoBuscado);
	}

}
