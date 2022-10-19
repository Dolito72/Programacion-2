package historiador.filtros;

import historiador.Documento;

public class FiltroCantidadPalabrasContenido extends Filtro{
	private int cantidadMinima;
	
	public FiltroCantidadPalabrasContenido(int cantidadMinima){
		this.cantidadMinima = cantidadMinima;
	}
	@Override
	public boolean cumple(Documento d) {
		return d.cantidadPalabras()> this.cantidadMinima;
	}

}
