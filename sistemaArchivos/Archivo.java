package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import sistemaArchivos.filtros.Filtro;

public class Archivo extends Elemento {
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamanio){
		super(nombre, fechaCreacion, tamanio);
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int t){
		this.tamanio = tamanio;
	}
	@Override
	public int getCantidadElementos() {
		return 1;
	}
	@Override
	public boolean equals(Object o) {
		try{
			Archivo otro = (Archivo)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e){
		return false;
		}
	}
	
	public String toString() {
		return this.getNombre();
	}

	@Override
	public ArrayList<Elemento> buscarElementos(Filtro filtro) {
		ArrayList<Elemento> resultado = new ArrayList<>();
			if (filtro.cumple(this));
				resultado.add(this);
				return resultado;
	}
	
}
