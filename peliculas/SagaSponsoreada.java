package peliculas;

import java.util.ArrayList;

import peliculas.filtros.Filtro;

public class SagaSponsoreada extends Saga {
	private Pelicula pelicula;

	public SagaSponsoreada(String titulo, Pelicula pelicula) {
		super(titulo);
		this.pelicula = pelicula;
		
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Elemento crearCopiaVacia(){
		return new SagaSponsoreada(this.getTitulo(), this.getPelicula());
	}
	@Override
	public ArrayList<Pelicula> listaPeliculas(Filtro f) {
		ArrayList<Pelicula> resultado = super.listaPeliculas(f);
		resultado.add(this.pelicula);
		return resultado;
	}

}
