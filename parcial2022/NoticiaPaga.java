package parcial2022;

import java.util.ArrayList;

import parcial2022.filtros.Filtro;

public class NoticiaPaga extends Noticia {

	public NoticiaPaga(String titulo, String contenido, String autor,String categoria) {
		super(titulo, contenido, autor, categoria);
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro f) {
		ArrayList<Noticia> resultado = new ArrayList<Noticia>();
		resultado.add(this);
		return resultado;
	}
	
	

}
