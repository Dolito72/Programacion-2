package futbol_5.filtros;

import futbol_5.Alquiler;
import futbol_5.Socio;

public class FiltroPorCanchaAlquilada extends Filtro {
	private String canchaBuscada;
	
	public FiltroPorCanchaAlquilada (String canchaBuscada){
		this.canchaBuscada = canchaBuscada;
	}

	@Override
	public boolean cumple(Socio s) {
		return s.alquiloCancha(canchaBuscada);
	}

}
