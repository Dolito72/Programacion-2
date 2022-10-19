package filesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import filesystem.filtros.Filtro;

public abstract class ElementoSistemaArchivos {

	private String nombre;

	public ElementoSistemaArchivos(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getTamanio();
	
	public abstract int getCantElementos();
	
	public abstract ArrayList<Archivo> buscarArchivos(Filtro filtro);
	
	public ArrayList<Archivo> buscarArchivosOrdenados(Filtro filtro, Comparator<Archivo> comparador) {
		ArrayList<Archivo> resultado = this.buscarArchivos(filtro);
		Collections.sort(resultado,comparador);
		return resultado;
	}
	
}
