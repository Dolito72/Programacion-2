package parcial2022;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion{
	private int cantidad;
	private String categoria;
	
	public SeccionEspecial(int cantidad, String Categoria){
		this.cantidad = cantidad;
		this.categoria = categoria;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> aux = super.getPalabrasClaves();
		Collections.sort(aux);
		ArrayList<String> resultado = new ArrayList<String>();
		for (int i = 0; i<=aux.size()&& i<= cantidad; i++){
			resultado.add(aux.get(i));
		}
		return aux;
	}

	
}
