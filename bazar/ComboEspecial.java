package bazar;

import bazar.comportamientos.Condicion;

public class ComboEspecial extends Combo{

	public ComboEspecial(String nombre, double descuento, double descuentoTotal,Condicion condicion) {
		super(nombre,descuento, descuentoTotal, condicion);
		
	}

	@Override
	public double getPrecio() {
		double precio = 0;
		for(Elemento e:elementos)
			if(e.getPrecio()> precio)
				precio = e.getPrecio();
	return precio;
	}

	
}
