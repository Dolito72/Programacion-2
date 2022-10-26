package aseguradora.filtros;

import aseguradora.Seguro;
import aseguradora.SeguroSimple;

public class FiltroPorDescripcion extends Filtro{
	private String descripcionBuscada;

	public FiltroPorDescripcion(String descripcionBuscada){
		this.descripcionBuscada = descripcionBuscada;
	}
	
	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getDescripcion().contains(descripcionBuscada);
	}

}
