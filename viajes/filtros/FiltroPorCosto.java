package viajes.filtros;

import viajes.ElementoViaje;

public class FiltroPorCosto extends Filtro{
	private int costoMinimo;
	
	public FiltroPorCosto(int costoMinimo){
		this.costoMinimo = costoMinimo;
	}

	@Override
	public boolean cumple(ElementoViaje viaje) {
		return viaje.getCosto()> costoMinimo;
	}

}
