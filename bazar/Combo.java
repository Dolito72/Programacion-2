package bazar;

import java.util.ArrayList;

import bazar.comportamientos.Condicion;

public class Combo extends Elemento{
	protected ArrayList<Elemento> elementos;
	private double descuento;
	private double descuentoTotal;
	private Condicion condicion;
	
	public Combo(String nombre, double descuento, double descuentoTotal, Condicion condicion){
		super(nombre);
		this.elementos = new ArrayList<Elemento>();
		this.descuento = descuento;
		this.descuentoTotal = descuentoTotal;
		this.condicion = condicion;
	}

	public void agregarElemento(Elemento e){
		if (condicion.cumple(e))
			this.elementos.add(e);
	}
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getDescuentoTotal() {
		return descuentoTotal;
	}

	public void setDescuentoTotal(double descuentoTotal) {
		this.descuentoTotal = descuentoTotal;
	}

	public Condicion getCondicion() {
		return condicion;
	}

	public void setCondicion(Condicion condicion) {
		this.condicion = condicion;
	}

	@Override
	public double getPrecio() {
		double precioTotal = 0;
		for (Elemento e:elementos)
			precioTotal += e.getPrecio();
		double descuento = this.descuento * this.getCantidadProductos();
		if (descuento> this.descuentoTotal)
			descuento = descuentoTotal;
		return precioTotal - precioTotal*descuento;
	}

	@Override
	public int getPeso() {
		int pesoTotal = 0;
		for (Elemento e:elementos)
			pesoTotal += e.getPeso();
		return pesoTotal;
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> resultado = new ArrayList<String>();
		for (Elemento e:elementos){
			ArrayList<String> resultadoHijo = e.getCategorias();
			for (String s: resultadoHijo){
				if(!resultadoHijo.contains(s))
					resultado.add(s);
			}
		}
		return resultado;
	}

	@Override
	public int getCantidadProductos() {
		int cantidadTotal = 0;
		for (Elemento e:elementos)
			cantidadTotal += e.getCantidadProductos();
		return cantidadTotal;
	}

	@Override
	public ArrayList<Elemento> listadoElementos(Condicion c) {
		ArrayList<Elemento> resultado = new ArrayList<Elemento>();
			if(c.cumple(this))
				resultado.add(this);
			else
				for (Elemento e: elementos)
					if(c.cumple(e))
					resultado.add(e);
		return resultado;
	}

	@Override
	public Elemento copia(Condicion c) {
		if(c.cumple(this)){
			ArrayList<Elemento> hijosQueCumplen = new ArrayList<>();
			for (Elemento e:elementos){
				Elemento copiaHijo = e.copia(c);
				if (copiaHijo!=null)
					hijosQueCumplen.add(copiaHijo);
			}
			if (hijosQueCumplen.isEmpty())
				return null;
			else{
			Combo copia = new Combo(this.getNombre(),this.getDescuento(), this.getDescuentoTotal(), this.getCondicion());
				for (Elemento e: hijosQueCumplen)
				copia.agregarElemento(e);
				return copia;
				
			}
		}
		return null;
		}
		
	@Override
	public Producto productoMenorPeso() {
		int pesoMenor = 99999999;
		Producto menor = null;
		for (Elemento e: elementos){
			Producto aux = e.productoMenorPeso();
			int temp = aux.getPeso();
			if (menor ==null || temp< pesoMenor){
				pesoMenor = temp;
				menor = aux;
			}
		}
		return menor;
	}

	

}
