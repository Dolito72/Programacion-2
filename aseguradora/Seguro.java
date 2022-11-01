package aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import aseguradora.filtros.Filtro;

public abstract class Seguro {
	public abstract int getDni();
	public abstract int calcularMontoAsegurado();
	public abstract int getNumeroPoliza();
	public abstract double getCosto();
	public abstract ArrayList<SeguroSimple> buscarSeguros(Filtro f);
	public ArrayList<SeguroSimple> buscarOrdenado(Filtro f, Comparator comp){
		ArrayList<SeguroSimple> resultado = this.buscarSeguros(f);
		Collections.sort(resultado,comp);
		return resultado;
	}
}
