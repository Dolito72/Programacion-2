
package bazar;

import java.util.ArrayList;

import bazar.comportamientos.Condicion;

public abstract class Elemento{
	private String nombre;
	
	public Elemento(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getPrecio();
	public  boolean contieneCategoria(String c){
		return this.getCategorias().contains(c);
	}
	public abstract int getPeso();
	public abstract ArrayList<String> getCategorias();
	public abstract int getCantidadProductos();
	public abstract ArrayList<Elemento> listadoElementos(Condicion c);
	public abstract Elemento copia(Condicion c);
	public abstract Producto productoMenorPeso();
	
}
