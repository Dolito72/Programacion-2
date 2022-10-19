package vivero.filtros;

import vivero.Planta;

public class FiltroPorNombreVulgar extends Filtro{
	private String nombreVulgarBuscado;
	
	public FiltroPorNombreVulgar(String nombreVulgarBuscado){
		this.nombreVulgarBuscado = nombreVulgarBuscado;
	}
	@Override
	public boolean cumple(Planta p) {
		return p.tieneNombreVulgar(nombreVulgarBuscado);
	}

}
