package practico_7a_ej_1.filtros;

import practico_7a_ej_1.Cultivo;
import practico_7a_ej_1.Enfermedad;
import practico_7a_ej_1.ProductoQuimico;

public class FiltroPorCultivo extends Filtro{
	private Cultivo cultivoApto;
	private Enfermedad enfermedadBuscada;
	
	public FiltroPorCultivo(Cultivo cultivoApto, Enfermedad enfermedadBuscada){
		this.cultivoApto = cultivoApto;
		this.enfermedadBuscada = enfermedadBuscada;
	}
	@Override
	public boolean cumple(ProductoQuimico p) {
		return !p.contieneCultivoDesaconsejado(cultivoApto) && this.enfermedadBuscada.trataEnfermedad(p); 
	}

}