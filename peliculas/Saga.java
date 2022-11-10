package peliculas;

import java.util.ArrayList;

import peliculas.filtros.Filtro;

public class Saga extends Elemento{
	private ArrayList<Elemento> elementos;

	public Saga(String titulo) {
		super(titulo);
		this.elementos = new ArrayList<>();
		
	}

	public void agregarElemento(Elemento e){
		this.elementos.add(e);
	}
	

	@Override
	public int getPuntaje() {
		int puntaje = 0;
		for(Elemento e:elementos)
			puntaje += e.getPuntaje();
		return puntaje/this.elementos.size();
	}

	@Override
	public int getcantidadOscars() {
		int cantidad = 0;
		for (Elemento e:elementos)
			cantidad += e.getcantidadOscars();
		return cantidad;
	}

	@Override
	public ArrayList<Actor> listaActores() {
		ArrayList<Actor> lista = new ArrayList<>();
		for (Elemento e: elementos){
			ArrayList<Actor> copiaHijo = e.listaActores();
			for(Actor a:copiaHijo)
				if(!copiaHijo.contains(a))
					lista.add(a);
		}
		return lista;
	}
	
	public Elemento crearCopiaVacia(){
		return new Saga(this.getTitulo());
	}
	@Override
	public Elemento copia(Filtro f) {
		Saga copia = (Saga) crearCopiaVacia();
		for (Elemento e:elementos){
			Elemento copiaHijo = e.copia(f);
				copia.agregarElemento(copiaHijo);
		}
		return copia;
	}

	@Override
	public ArrayList<Pelicula> listaPeliculas(Filtro f) {
		ArrayList<Pelicula> resultado = new ArrayList<>();
		for (Elemento e:elementos){
			ArrayList<Pelicula> resHija = e.listaPeliculas(f);
			resultado.addAll(resHija);
		}
		return resultado; 
	}

}
