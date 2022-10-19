
package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaArchivos.filtros.Filtro;

public abstract class Elemento{
	private String nombre;
	private LocalDate fechaCreacion;
	protected int tamanio;
	
	public Elemento(String nombre, LocalDate fechaCreacion, int tamanio){
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamanio = tamanio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public abstract int getTamanio();
	
	public abstract int getCantidadElementos();

	@Override
	public boolean equals(Object o) {
		try{
			Elemento otro = (Elemento)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public abstract ArrayList<Elemento> buscarElementos(Filtro filtro);
	
	public ArrayList<Elemento> buscarElementosOrdenados(Filtro filtro, Comparator<Elemento> comparador) {
		ArrayList<Elemento> resultado = this.buscarElementos(filtro);
		Collections.sort(resultado,comparador);
		return resultado;
	}
}