package puerto;

import java.util.ArrayList;

// Obsoleta, reemplazada por ColaOrdenada
public class ColaEsperaBarcos {

	private ArrayList<Barco> barcos;
	
	public ColaEsperaBarcos() {
		this.barcos = new ArrayList<>();
	}
	
	public Barco siguiente() {
		Barco siguiente = this.barcos.get(0);
		this.barcos.remove(0);
		return siguiente;
	}
	
	public boolean estaVacia() {
		return this.barcos.isEmpty();
	}
	
	public void add(Barco barcoNuevo) {
	
		int index = 0;
		boolean encontrado = false;

		while (!encontrado && index < this.barcos.size()) {
			Barco aux = this.barcos.get(index);
			if (aux.getCapacidad() > barcoNuevo.getCapacidad()) {
				index++;
			} else {
				encontrado = true;
			}
		}

		this.barcos.add(index, barcoNuevo);
	}
	
}
