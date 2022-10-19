package vivero.filtros;

import vivero.Planta;

public class FiltroPorNombreCientifico extends Filtro{
	private String nombreCientificoBuscado;
	
	public FiltroPorNombreCientifico(String nombreCientificoBuscado){
		this.nombreCientificoBuscado = nombreCientificoBuscado;
	}

	@Override
	public boolean cumple(Planta p) {
		return p.getNombreCientifico().contains(nombreCientificoBuscado);
	}

}
