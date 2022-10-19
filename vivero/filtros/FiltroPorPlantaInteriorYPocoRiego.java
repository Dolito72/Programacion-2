package vivero.filtros;

import vivero.Planta;

public class FiltroPorPlantaInteriorYPocoRiego extends Filtro{
	private int riegoMaximo;
	boolean EsDeInterior;
	@Override
	public boolean cumple(Planta p) {
		return (p.getInterior() && p.getRiego()< riegoMaximo);
	}

}
