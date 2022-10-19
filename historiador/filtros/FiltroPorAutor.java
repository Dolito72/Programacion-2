package historiador.filtros;

import historiador.Documento;

public class FiltroPorAutor extends Filtro{
	private String autorBuscado;
	
	public FiltroPorAutor(String autorBuscado){
		this.autorBuscado = autorBuscado;
	}

	@Override
	public boolean cumple(Documento d) {
		return d.tieneAutor(this.autorBuscado);
	}

}
