package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public class FiltroPorTamanioTexto extends Filtro {
	private int tamanioMinimo;
	
	public FiltroPorTamanioTexto(int tamanioMinimo){
		this.tamanioMinimo = tamanioMinimo;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.getTexto().length() > tamanioMinimo;
	}

}
