package historiador.filtros;

import historiador.Documento;

public class FiltroSinPalabras extends Filtro{

	@Override
	public boolean cumple(Documento d) {
		return (!d.tienePalabraClave(null));
	}

}


