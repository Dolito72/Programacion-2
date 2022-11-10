
package traductor;
import java.util.ArrayList;

import traductor.filtros.Filtro;

public abstract class Elemento{
	private Idioma idioma;

	
	public Elemento (Idioma idioma){
		this.idioma = idioma;


	}

	public Idioma getIdioma() {
		return idioma;
	}
	public abstract int getCantidadPalabras();
	public abstract Elemento traducir(Idioma destino);
	public abstract ArrayList<Parrafo> listaParrafos(Filtro f);
}