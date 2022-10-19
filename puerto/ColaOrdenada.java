package puerto;
import java.util.ArrayList;
import java.util.*;
public class ColaOrdenada {
	private ArrayList<Comparable> elementos;

	public ColaOrdenada() {
		this.elementos = new ArrayList<>();
	}
	
	public Object siguiente() {
		Object siguiente = this.elementos.get(0);
		this.elementos.remove(0);
		return siguiente;
	}
	
	public boolean estaVacia() {
		return this.elementos.isEmpty();
	}
	
	//public void add(Comparable objNuevo) {
		//int index = 0;
	//	boolean encontrado = false;
	//	while (!encontrado && index < this.elementos.size()) {
	//		Comparable aux = this.elementos.get(index);
		//	if (aux.compareTo(objNuevo) > 0) {
	//			index++;
		//	} 
	//		else {
			//	encontrado = true;
		//	}
	//	}

	//	this.elementos.add(index, objNuevo);
	//}

	public void add(Comparable nuevo){
		this.elementos.add(nuevo);
		Collections.sort(elementos);
	}
}


