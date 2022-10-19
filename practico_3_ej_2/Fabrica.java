package practico_3_ej_2;

import java.util.ArrayList;
public class Fabrica {
	private ArrayList<Producto> productos;
	private int stock;
	
	public Fabrica(int stock){
		this.stock = stock;
		productos = new ArrayList<>();
	}

	public void addProducto(Producto p){
		if(!productos.contains(p)){
			productos.add(p);
		}
	}
	public int getStock() {
		return productos.size();
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
