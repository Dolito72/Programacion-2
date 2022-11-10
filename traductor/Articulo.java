package traductor;

import java.util.ArrayList;

import traductor.filtros.Filtro;

public class Articulo extends Elemento{
	private ArrayList<Elemento> elementos;
	
	public Articulo(Idioma idioma){
		super(idioma);
		this.elementos = new ArrayList<>();
	}
	
	public void agregarElemento(Elemento e){
		this.elementos.add(e);
	}

	@Override
	public int getCantidadPalabras() {
		int cantidad = 0;
		for(Elemento e:elementos)
			cantidad += e.getCantidadPalabras();
		return cantidad;
	}

	@Override
	public Elemento traducir(Idioma destino) {
		Articulo copia = new Articulo (destino);
		for (Elemento e:elementos)
			copia.agregarElemento(e.traducir(destino));
		return copia;
	}

	@Override
	public ArrayList<Parrafo> listaParrafos(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}

}
