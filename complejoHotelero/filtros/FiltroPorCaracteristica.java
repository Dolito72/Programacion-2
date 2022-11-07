package complejoHotelero.filtros;

import complejoHotelero.Habitacion;

public class FiltroPorCaracteristica extends Filtro{
	private String caracteristicaBuscada;
	
	public FiltroPorCaracteristica(String caracteristicaBuscada){
		this.caracteristicaBuscada = caracteristicaBuscada;
	}

	@Override
	public boolean cumple(Habitacion h) {
		return h.tieneCaracteristica(caracteristicaBuscada);
	}

}
