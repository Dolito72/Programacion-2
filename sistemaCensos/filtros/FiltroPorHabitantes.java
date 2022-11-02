package sistemaCensos.filtros;

import sistemaCensos.Comarca;

public class FiltroPorHabitantes extends Filtro {
	private int cantidadMinima;
	
	public FiltroPorHabitantes(int cantidadMinima){
		this.cantidadMinima = cantidadMinima;
	}
	@Override
	public boolean cumple(Comarca c) {
		return c.CantidatotalHabitantes()> cantidadMinima;
	}

}
