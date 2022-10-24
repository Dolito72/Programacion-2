package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaArchivos.filtros.Filtro;

public class Directorio extends Elemento{
	ArrayList<Elemento> elementos;
	
	public Directorio(String nombre, LocalDate fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion, tamanio);
		this.elementos = new ArrayList<>();
	}

	public void addElemento(Elemento e){
		// Para usar el contains, debo implementar el equals 
		// en todas las subclases de ElementoSistemaArchivos
		if (!this.elementos.contains(e))
			this.elementos.add(e);
	}
	

	@Override
	public int getTamanio() {
		int tamanio = 0;
		for (Elemento e:elementos){
			tamanio += e.getTamanio();
		}
		return tamanio;
	}

	@Override
	public int getCantidadElementos() {
		int cantidad = this.elementos.size();
		for (Elemento e:elementos){
			cantidad += e.getCantidadElementos();
		}
		return cantidad;
	}
	
	@Override
	public boolean equals(Object o) {
		try{
			Directorio otro = (Directorio) o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e){
		return false;
		}
	}

	public String toString() {
		String resultado = this.getNombre() + ": [";
		for (Elemento e: elementos){
			resultado += e.toString() + ", ";
		}
		resultado += "]";	
		
		return resultado;
	}

	@Override
	public ArrayList<Elemento> buscarElementos(Filtro filtro) {
		ArrayList<Elemento>resultado =new ArrayList<>();
		for (Elemento e:elementos){
			ArrayList<Elemento> listaHija = e.buscarElementos(filtro);
			resultado.addAll(listaHija);
		}
		return resultado;
	}
	
	public ArrayList<Elemento> buscarElementosOrdenados(Filtro filtro, Comparator<Elemento> comparador) {
		ArrayList<Elemento> resultado = this.buscarElementos(filtro);
		Collections.sort(resultado,comparador);
		return resultado;
	}
}
