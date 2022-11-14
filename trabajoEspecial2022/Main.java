package trabajoEspecial2022;

import java.util.Comparator;

import filesystem.Archivo;
import filesystem.comparadores.ComparadorPorTamanio;

public class Main {

	public static void main(String[] args) {
		Comparator <Object> comparador = new ComparadorPorIntegers();	
		ListaEnlazada lista = new ListaEnlazada(null, comparador, 0);		
		System.out.println("Esta vacía " + lista.estaVacia());		
		lista.insertarOrdenado(new Nodo(new Integer (10)));
		lista.insertarOrdenado(new Nodo(new Integer (21)));
		lista.insertarOrdenado(new Nodo(new Integer (1)));
		lista.insertarOrdenado(new Nodo(new Integer (5)));
		lista.insertarOrdenado(new Nodo(new Integer (11)));
	
		System.out.println("Primer elemento " + lista.obtenerNodo(0).getObjeto().toString());
		System.out.println("Segundo elemento " + lista.obtenerNodo(1).getObjeto().toString());
		System.out.println("Tercer elemento " + lista.obtenerNodo(2).getObjeto().toString());
		System.out.println("Cuarto elemento " + lista.obtenerNodo(3).getObjeto().toString());
		System.out.println("Quinto elemento " + lista.obtenerNodo(lista.size()-1).getObjeto().toString());
		System.out.println("Esta vacía " + lista.estaVacia());
		System.out.println("Tamaño " + lista.size());
		
		
		Comparator <Object> compString = new ComparadorPorStrings();	
		ListaEnlazada listaString = new ListaEnlazada(null, compString, 0);		
		System.out.println("Esta vacía " + listaString.estaVacia());		
		listaString.insertarOrdenado(new Nodo(new String ("Fácil")));
		listaString.insertarOrdenado(new Nodo(new String ("Es")));
		listaString.insertarOrdenado(new Nodo(new String ("Parcial")));
		listaString.insertarOrdenado(new Nodo(new String ("Prog 2")));
		
		
		System.out.println("Primer elemento " + listaString.obtenerNodo(0).getObjeto().toString());
		System.out.println("Segundo elemento " + listaString.obtenerNodo(1).getObjeto().toString());
		System.out.println("Tercer elemento " + listaString.obtenerNodo(2).getObjeto().toString());
		System.out.println("Ultimo elemento " + listaString.obtenerNodo(listaString.size()-1).getObjeto().toString());
	
		System.out.println("Tamaño " + lista.size());
		
		

	    }
	}


