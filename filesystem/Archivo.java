package filesystem;

import java.util.ArrayList;

import filesystem.filtros.Filtro;

public class Archivo extends ElementoSistemaArchivos implements Comparable<Archivo> {

	private String ext;
	private int tamanio;

	public Archivo(String nombre, String ext, int tam) {
		super(nombre);
		this.ext = ext;
		this.tamanio = tam;
	}
	
	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public boolean equals(Object o) {
		try {
			Archivo a = (Archivo) o;
			return a.getNombre().equals(this.getNombre()) && 
					this.getExt().equals(a.getExt());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int getCantElementos() {
		return 0;
	}
	
	public String toString() {
		return this.getNombre() + "." + this.getExt();
	}

	@Override
	public ArrayList<Archivo> buscarArchivos(Filtro filtro) {
		ArrayList<Archivo> resultado = new ArrayList<>();
		
		if (filtro.cumple(this))
			resultado.add(this);
		
		return resultado;
	}

	@Override
	public int compareTo(Archivo otro) {
		return this.getNombre().compareTo(otro.getNombre());
	}

}
