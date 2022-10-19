package sistemaArchivos.filtros;

import sistemaArchivos.Elemento;

public class FiltroPorNombre extends Filtro {
	private String palabraBuscada;
	
	public FiltroPorNombre(String palabraBuscada){
		this.palabraBuscada = palabraBuscada;
	}
	@Override
	public boolean cumple(Elemento e) {
		return e.getNombre().contains (palabraBuscada);
	}

}
