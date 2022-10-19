package practico_7a_ej_1.filtros;

import practico_7a_ej_1.Enfermedad;
import practico_7a_ej_1.ProductoQuimico;


public class FiltroporEnfermedad extends Filtro{
	private Enfermedad enfermedadBuscada;
	
	public FiltroporEnfermedad (Enfermedad enfermedadBuscada){
		this.enfermedadBuscada= enfermedadBuscada;
	}

	@Override
	public boolean cumple(ProductoQuimico p) {
		return  this.enfermedadBuscada.trataEnfermedad(p);
	}
}
