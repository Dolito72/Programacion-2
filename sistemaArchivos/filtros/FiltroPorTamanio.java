package sistemaArchivos.filtros;

import sistemaArchivos.Elemento;

public class FiltroPorTamanio extends Filtro {
	private int tamanioMaximo;
	
	public FiltroPorTamanio(int tamanioMaximo){
		this.tamanioMaximo = tamanioMaximo;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getTamanio()< this.tamanioMaximo;
	}

}
