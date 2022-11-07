package bazar.comportamientos;

import bazar.Elemento;

public class CondicionPorCategoria extends Condicion{
	private String categoriaBuscada;
	
	public CondicionPorCategoria(String categoriaBuscada){
		this.categoriaBuscada = categoriaBuscada;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.contieneCategoria(categoriaBuscada);
	}
	
}