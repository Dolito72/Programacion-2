package bazar;

import java.util.ArrayList;

import bazar.comportamientos.Condicion;

public class Producto extends Elemento{
	private ArrayList<String> categorias;
	private double precio;
	private int peso;
	
	public Producto(String nombre,double precio, int peso){
		super (nombre);
		this.precio = precio;
		this.peso = peso;
		this.categorias = new ArrayList<String>();
	}

	public void agregarCategoria (String s){
		if (!this.categorias.contains(s))
			this.categorias.add(s);
	}
	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public ArrayList<String> getCategorias() {
		return new ArrayList<String> (categorias);
	}

	@Override
	public int getCantidadProductos() {
		return 1;
	}

	@Override
	public ArrayList<Elemento> listadoElementos(Condicion c) {
		ArrayList<Elemento>resultado = new ArrayList<Elemento>();
		if(c.cumple(this))
			resultado.add(this);
		return resultado;
	}

	
	@Override
	public Elemento copia(Condicion c) {
		if (c.cumple(this)){
			Producto copia = new Producto(this.getNombre(),this.getPrecio(), this.getPeso() );
			for (String s:categorias)
				copia.agregarCategoria(s);
			
		return copia;
		}
		return null;
	}

	@Override
	public Producto productoMenorPeso() {
		return this;
	}

	
}
