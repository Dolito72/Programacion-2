package filesystem;

import java.util.ArrayList;

import filesystem.filtros.Filtro;

public class AccesoDirecto extends ElementoSistemaArchivos {

	private static int TAMANIO = 1;
	
	public static void setTamanio(int tam) {
		TAMANIO = tam;
	}
	
	private ElementoSistemaArchivos ref;
	
	public AccesoDirecto(String nombre, ElementoSistemaArchivos ref) {
		super(nombre);
		this.ref = ref;
	}

	@Override
	public int getTamanio() {
		return TAMANIO;
	}

	@Override
	public int getCantElementos() {
		return 0;
	}

	public ElementoSistemaArchivos getRef() {
		return ref;
	}

	@Override
	public ArrayList<Archivo> buscarArchivos(Filtro filtro) {
		return new ArrayList<Archivo>();
	}

}
