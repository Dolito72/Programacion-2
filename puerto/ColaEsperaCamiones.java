package puerto;

import java.util.ArrayList;

//Obsoleta, reemplazada por ColaOrdenada
public class ColaEsperaCamiones {

	private ArrayList<Camion> camiones;
	
	public ColaEsperaCamiones() {
		this.camiones = new ArrayList<>();
	}
	
	public Camion siguienteCamion() {
		Camion siguiente = this.camiones.get(0);
		this.camiones.remove(0);
		return siguiente;
	}
	
	public boolean estaVacia() {
		return this.camiones.isEmpty();
	}
	
	public void addCamion(Camion camionNuevo) {
	
		int index = 0;
		boolean encontrado = false;

		while (!encontrado && index < this.camiones.size()) {
			Camion aux = this.camiones.get(index);
			if (aux.getFechaCarga() < camionNuevo.getFechaCarga()) {
				index++;
			} else {
				encontrado = true;
			}
		}

		this.camiones.add(index, camionNuevo);
	}
	
}
