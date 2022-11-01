
package sistemaComunicados.filtros;


import sistemaComunicados.Empleado;
import sistemaComunicados.Notificacion;

public abstract class Filtro{
	
	public abstract boolean cumple(Notificacion n);
	
}