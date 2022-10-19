package libreria;

import java.util.ArrayList;

public class Libreria {
	
	private ArrayList<Articulo> articulos;
	private ArrayList<Cliente> clientes;
	
	public Libreria() {
		this.articulos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	
	public void addArticulo(Articulo a) {
		if (!this.articulos.contains(a))
			this.articulos.add(a);
	}
	
	public void addCliente(Cliente c) {
		if (!this.clientes.contains(c))
			this.clientes.add(c);
	}
	
	public double getPrecio(Articulo a, Cliente c) {
		return a.getPrecio(c);
	}
	
	public boolean comproProducto(Cliente c, Articulo a) {
		return c.yaCompraste(a);
	}
	
	public ArrayList<Cliente> getClientesQueLeGusta(Articulo p) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		for (int i = 0; i < this.clientes.size(); i++)
			if (this.clientes.get(i).meGusta(p))
				resultado.add(this.clientes.get(i));
		
		return resultado;
			
	}

}