package aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import aseguradora.filtros.Filtro;

public abstract class Seguro {
	public abstract int getDni();
	public abstract int calcularMontoAsegurado();
	public abstract int numeroPoliza();
	public abstract double getCosto();
	public abstract ArrayList<Seguro> buscarSeguros(Filtro f);
	public ArrayList<Seguro> buscarOrdenado(Filtro f, Comparator comp){
		ArrayList<Seguro> resultado = this.buscarSeguros(f);
		Collections.sort(resultado,comp);
		return resultado;
	}
}
