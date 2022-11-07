
package parcial2022;

import java.util.ArrayList;

import parcial2022.filtros.Filtro;

public abstract class Elemento{
	public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ArrayList<Noticia> buscarNoticias(Filtro f);
}