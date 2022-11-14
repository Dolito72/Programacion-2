
package trabajoEspecial2022;

public class Nodo{

	private Object objeto;
	private Nodo siguiente;
	
	public Nodo( Object objeto){
		this.objeto = objeto;
		this.siguiente = null;
	}

	

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public Nodo obtenerSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public void enlazarSiguiente (Nodo n){
		siguiente = n;
	}
	
	public String toString() {
		return this.objeto.toString();
	}

}