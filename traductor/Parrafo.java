package traductor;

import java.util.ArrayList;

import traductor.filtros.Filtro;

public class Parrafo extends Elemento{
	protected ArrayList<String> palabras;

	public Parrafo(Idioma idioma) {
		super(idioma);
		this.palabras = new ArrayList<String>();
	}

	public void agregarPalabra (String p){
		this.palabras.add(p);
	}
	@Override
	public int getCantidadPalabras() {
		return palabras.size();
	}

	@Override
	public Elemento traducir(Idioma destino) {
		Parrafo copia = new Parrafo (destino);
		for (String p: palabras)
			this.getIdioma().traducir(destino, p);
		return copia;
		
	}

	@Override
	public ArrayList<Parrafo> listaParrafos(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}

}
