package historiador.filtros;

import historiador.Documento;

public class FiltroPorContenido extends Filtro {
	private String contenidoBuscado;
	
	public FiltroPorContenido(String contenidoBuscado){
		this.contenidoBuscado = contenidoBuscado;
	}
	@Override
	public boolean cumple(Documento d) {
		return d.getContenido().contains(contenidoBuscado);
	}
	


}
