package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public class FiltroPorAutor extends Filtro{
	private String autorBuscado;
	
	public FiltroPorAutor(String autorBuscado){
		this.autorBuscado = autorBuscado;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.getAutor().equals(autorBuscado);
	}

}
