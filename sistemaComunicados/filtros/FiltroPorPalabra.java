package sistemaComunicados.filtros;

import sistemaComunicados.Empleado;
import sistemaComunicados.Notificacion;

public class FiltroPorPalabra extends Filtro{
	private String palabraBuscada;
	
	public FiltroPorPalabra(String palabraBuscada){
		this.palabraBuscada = palabraBuscada;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return n.tienePalabra(palabraBuscada);
	}


}
