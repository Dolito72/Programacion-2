package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public class FiltroPorTitulo extends Filtro {
	private String tituloBuscado;
	
	public FiltroPorTitulo(String tituloBuscado){
		this.tituloBuscado = tituloBuscado;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.getTitulo().equals(this.tituloBuscado);
	}

}
