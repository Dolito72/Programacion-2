package bazar.comportamientos;

import bazar.Elemento;

public class CondicionPorPrecio extends Condicion{
	private int precioMayor;
	
	public CondicionPorPrecio(int precioMayor){
		this.precioMayor = precioMayor;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getPrecio()<= precioMayor;
	}
	
}