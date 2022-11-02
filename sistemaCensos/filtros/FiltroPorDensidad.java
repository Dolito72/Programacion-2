package sistemaCensos.filtros;

import sistemaCensos.Comarca;

public class FiltroPorDensidad extends Filtro{

	private int densidadMinima;
	
	public FiltroPorDensidad(int densidadMinima){
		this.densidadMinima = densidadMinima;
	}
	@Override
	public boolean cumple(Comarca c) {
		return c.DensidadPoblacion()> densidadMinima;
	}

}
