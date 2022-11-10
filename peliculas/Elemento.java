
package peliculas;

import java.util.ArrayList;

import peliculas.filtros.Filtro;

public abstract class Elemento{
	private String titulo;
	
	public Elemento(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public abstract Elemento crearCopiaVacia();
	public abstract int getPuntaje();
	public abstract int getcantidadOscars();
	public abstract ArrayList<Actor> listaActores();
	public abstract Elemento copia(Filtro f);
	public abstract ArrayList<Pelicula> listaPeliculas(Filtro f);
	
	
	
}