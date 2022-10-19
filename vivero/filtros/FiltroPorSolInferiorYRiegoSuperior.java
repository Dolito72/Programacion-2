
package vivero.filtros;

import vivero.Planta;

public class FiltroPorSolInferiorYRiegoSuperior extends Filtro {
	private int solMaximo;
	private int riegoMinimo;
	
	public FiltroPorSolInferiorYRiegoSuperior(int solMaximo, int riegoMinimo){
		this.solMaximo = solMaximo;
		this.riegoMinimo = riegoMinimo;
	}
	@Override
	public boolean cumple(Planta p) {
		return (p.getSol()<solMaximo) && (p.getRiego()>riegoMinimo);
	}

}
