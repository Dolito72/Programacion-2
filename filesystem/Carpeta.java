package filesystem;

import java.util.ArrayList;

import filesystem.filtros.Filtro;

public class Carpeta extends ElementoSistemaArchivos {

	private ArrayList<ElementoSistemaArchivos> elementos;
	
	public Carpeta(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoSistemaArchivos elemento) {
		// Para usar el contains, debo implementar el equals 
		// en todas las subclases de ElementoSistemaArchivos
		if (!this.elementos.contains(elemento))
			this.elementos.add(elemento);
	}
		
	@Override
	public int getTamanio() {
		int tamanioTotal = 0;
		
		for (int index = 0; index < this.elementos.size(); index++) {
			ElementoSistemaArchivos elemento = this.elementos.get(index);
			tamanioTotal += elemento.getTamanio();
		}
		
		return tamanioTotal;
	}
	
	public int getCantElementos() {
		int cantTotal = this.elementos.size();
		
		for (int index = 0; index < this.elementos.size(); index++) {
			ElementoSistemaArchivos elemento = this.elementos.get(index);
			cantTotal += elemento.getCantElementos();
		}
		
		return cantTotal;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Carpeta otra = (Carpeta) o;
			return otra.getNombre().equals(this.getNombre());
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public String toString() {
		String resultado = this.getNombre() + ": [";
		
		for (int index = 0; index < this.elementos.size(); index++) {
			ElementoSistemaArchivos elem = this.elementos.get(index);
			resultado += elem.toString() + ", ";
		}
		
		//resultado = resultado.substring(0, resultado.length()-2);
		resultado += "]";	
		
		return resultado;
	}

	@Override
	public ArrayList<Archivo> buscarArchivos(Filtro filtro) {
		ArrayList<Archivo> resultado = new ArrayList<>();

		for (int index = 0; index < this.elementos.size(); index++) {
			ElementoSistemaArchivos elem = this.elementos.get(index);
			ArrayList<Archivo> listaHija = elem.buscarArchivos(filtro);
			// resultado.addAll(listaHija);
			for (int index_hijo = 0; index_hijo < listaHija.size(); index_hijo++) {
				resultado.add(listaHija.get(index_hijo));
			}
				
		}		
		
		return resultado;
	}
}
