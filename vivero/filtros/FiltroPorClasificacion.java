package vivero.filtros;

import vivero.Planta;

public class FiltroPorClasificacion extends Filtro{
	private String clasificacionBuscada;
	
	public FiltroPorClasificacion(String clasificacionBuscada){
		this.clasificacionBuscada = clasificacionBuscada;
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getClasificacion().equals(clasificacionBuscada);
	}

}
