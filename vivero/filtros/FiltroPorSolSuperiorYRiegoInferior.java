package vivero.filtros;

import vivero.Planta;

public class FiltroPorSolSuperiorYRiegoInferior extends Filtro {
	private int solMinimo;
	private int riegoMaximo;
	
	public FiltroPorSolSuperiorYRiegoInferior(int solMinimo, int riegoMaximo){
		this.solMinimo = solMinimo;
		this.riegoMaximo = riegoMaximo;
	}
	@Override
	public boolean cumple(Planta p) {
		return (p.getSol()>solMinimo) && (p.getRiego()<riegoMaximo);
	}

}
