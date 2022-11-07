package bazar.comportamientos;

import bazar.Elemento;

public class CondicionPorPeso extends Condicion{
	private int pesoMenor;
	
	public CondicionPorPeso(int pesoMenor){
		this.pesoMenor = pesoMenor;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getPeso()> pesoMenor;
	}
	
}