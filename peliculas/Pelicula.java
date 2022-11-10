package peliculas;

import java.util.ArrayList;

import peliculas.filtros.Filtro;

public class Pelicula extends Elemento{
	private int puntaje;
	private int anoLanzamiento;
	private int cantidadOscar;
	ArrayList<Actor> actores;

	public Pelicula(String titulo, int puntaje, int anoLanzamiento, int cantidadOscar) {
		super(titulo);
		this.puntaje = puntaje;
		this.anoLanzamiento = anoLanzamiento;
		this.cantidadOscar = cantidadOscar;
		this.actores = new ArrayList<Actor>();
	}
	public void agregarActor(Actor a){
		if(!this.actores.contains(a))
			actores.add(a);
	}
	
	public int cantidadActores(){
		return actores.size();
	}
	public int getAnoLanzamiento() {
		return anoLanzamiento;
	}

	public void setAnoLanzamiento(int anoLanzamiento) {
		this.anoLanzamiento = anoLanzamiento;
	}

	public void setCantidadOscar(int cantidadOscar) {
		this.cantidadOscar = cantidadOscar;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	
	@Override
	public int getPuntaje() {
		return puntaje;
	}

	@Override
	public int getcantidadOscars() {
		return cantidadOscar;
	}

	@Override
	public ArrayList<Actor> listaActores() {
		return new ArrayList<Actor>(actores);
	}
	
	public boolean actuo(Actor a){
		return actores.contains(a);
	}

	@Override
	public Elemento crearCopiaVacia() {
		return new Pelicula(this.getTitulo(),this.getPuntaje(), this.anoLanzamiento,
				this.cantidadOscar);
	}
	@Override
	public Elemento copia(Filtro f) {
		if(f.cumple(this)){
			Pelicula copia = (Pelicula) this.crearCopiaVacia();
			for(Actor a:actores)
			copia.agregarActor(a);
		return copia;
		}	
		return null;
	}

	@Override
	public ArrayList<Pelicula> listaPeliculas(Filtro f) {
		ArrayList<Pelicula> resultado = new ArrayList<Pelicula>();
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}
	

}
