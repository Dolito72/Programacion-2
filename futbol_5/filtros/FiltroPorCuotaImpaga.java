package futbol_5.filtros;

import futbol_5.Socio;

public class FiltroPorCuotaImpaga extends Filtro {

	@Override
	public boolean cumple(Socio s) {
		return  !s.isCuotaPaga();
	}
}
