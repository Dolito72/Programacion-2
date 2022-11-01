package sistemaComunicados.filtros;

import sistemaComunicados.Empleado;
import sistemaComunicados.Notificacion;

public class FiltroPorCantidadNotif extends Filtro {
	private int cantidadMaxima;
	
	public FiltroPorCantidadNotif(int cantidadMaxima){
		this.cantidadMaxima = cantidadMaxima;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return n.getCantidadPalabras()< cantidadMaxima;
	}

}
