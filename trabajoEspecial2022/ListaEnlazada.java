package trabajoEspecial2022;

import java.util.Comparator;
import java.util.Iterator;

public class ListaEnlazada implements Iterable<Object>{
	private Nodo cabeza;
	private Comparator criterio;
	int size;
	
	public ListaEnlazada(Nodo cabeza, Comparator<Object> comp, int size){
		this.cabeza = null;
		this.criterio = comp;
		this.size = size;
	}
	
	public void setComparador(Comparator<Object> criterio) {
		this.criterio = criterio;
	}

	public void insertarOrdenado(Object nuevo) {
		Nodo n = new Nodo(nuevo);
		if(this.cabeza == null){
			this.cabeza = n;
		}
		else{
			Nodo ant = null;
			Nodo temp = this.cabeza;
			while (temp!=null && criterio.compare(temp.getObjeto(), ((Nodo)nuevo).getObjeto())< 0){
				ant = temp;
				temp = temp.obtenerSiguiente();
			}
			if(temp == null){
				ant.enlazarSiguiente(n);
			}
			else{
				n.enlazarSiguiente(temp);
				if(temp == this.cabeza){
					this.cabeza = n;
				}
				else {
					ant.enlazarSiguiente(n);
				}
			}
			this.size++;
		}
	}
	public int size(){
		return this.size;
	}
	
	public boolean estaVacia(){
		return (cabeza == null)?true:false; //si la cabeza es null retorno verdadero y sino falso
	}
	
	
	public Nodo obtenerNodo(int pos){
		if(this.estaVacia() || pos < 0 || pos >= this.size() ){
			return null;
		}
		else{
			int contador = 0;
			Nodo buscado = cabeza;
				while(contador < pos){
					buscado = buscado.obtenerSiguiente();
					contador++;
				}
		return buscado;
		}
	}
	
	public Object obtenerPosicion(Object obj){
		int contador = 0;
		if (this.estaVacia()) {
			return -1;
		}
		else{
			 Nodo temporal = cabeza;
			 int posicion = 0;
			 while (temporal!= null){
				 if(obj.equals(temporal.getObjeto()))
					 return posicion; // existe
			contador++;
			temporal = temporal.obtenerSiguiente();
		}
		return -1; // si no encuentra devuelve esto
		}
	}
	
	public void eliminarPrimerNodo() {
		if (estaVacia()) 
            return;
         else {
        	 cabeza = cabeza.obtenerSiguiente();
         }
	}
	
	public void eliminarNodo(int pos){
		if (this.estaVacia() || (pos< 0 || pos >= this.size())) {
            return;
		}
		else if (pos == 0) {
	             this.eliminarPrimerNodo();
	             return;
	    } 
		else{
			int contador = 0;
			Nodo temporal = cabeza;
			while (contador < pos-1){
				temporal = temporal.obtenerSiguiente();
				contador++;
			}
			temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
		}
		size--;
	}
	
	public void eliminarTodasLasOcurrencias(Object obj) {
		if(this.estaVacia()) {
			return;
		}
		else {
			Nodo p = cabeza;;
			   
			    while(p!=null) {
			        while(p.obtenerSiguiente() != null) {
			            if(p.getObjeto() == obj) {
			            	p.setSiguiente(p.obtenerSiguiente().obtenerSiguiente()); //el siguente de p es el 3ro
			              } else {
			                p = p.obtenerSiguiente();
			            }
			        }
			        p = p.obtenerSiguiente(); //ahora p es el segundo
			    }
			}
	}

	@Override
	public Iterator<Object> iterator() {
		return new IteratorNodos();
	}
	
	//Creo la clase interna MyIterator, que implementa la interfaz Iterator
    private class IteratorNodos  implements Iterator<Object>{
    		private int siguiente; //Indica el siguiente elemento que se va a devolver 
    
        //Indica si hay un elemento
        @Override
        public boolean hasNext() {
            return obtenerNodo(siguiente)!=null;
        }
 
        //Devuelve el elemento actual e incrementa al siguiente
        @Override
        public Object next() {
            Object obj = obtenerNodo(siguiente).getObjeto();
            siguiente++;
            return obj;
        }
     }
     

	
	
	
}
