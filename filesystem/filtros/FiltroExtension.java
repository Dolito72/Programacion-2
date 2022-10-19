package filesystem.filtros;

import filesystem.Archivo;

public class FiltroExtension extends Filtro {

	private String extensionBuscada;
	
	public FiltroExtension(String extensionBuscada) {
		this.extensionBuscada = extensionBuscada;
	}
	
	@Override
	public boolean cumple(Archivo archivo) {
		return archivo.getExt().equals(this.extensionBuscada);
	}

}
