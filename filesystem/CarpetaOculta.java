package filesystem;

import java.util.ArrayList;

import filesystem.filtros.Filtro;

public class CarpetaOculta extends Carpeta {

	public CarpetaOculta(String nombre) {
		super(nombre);
	}
	
	public ArrayList<Archivo> buscarArchivo(Filtro filtro) {
		return new ArrayList<>();
	}

}
