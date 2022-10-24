package futbol_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import futbol_5.filtros.Filtro;

public class Club {
	private String nombre;
	private ArrayList<Socio>socios;
	private ArrayList<Alquiler>alquileres;
	
	public Club (String nombre){
		this.nombre = nombre;
		this.socios = new ArrayList<>();
		this.alquileres = new ArrayList<>();
	}
	
	public void addSocio(Socio s){
		if (!this.socios.contains(s)){
			this.socios.add(s);
		}
	}
	
	public void addAlquiler(Alquiler a){
		if (!this.alquileres.contains(a)){
			this.alquileres.add(a);
		}
	}
	
	public ArrayList<Socio> ListadoSociosOrdenados(Filtro f, Comparator<Socio> comp){
		ArrayList<Socio> resultado = new ArrayList<>();
		for (Socio s:socios){
			if (f.cumple(s)){
				resultado.add(s);
			}
		}
		Collections.sort(resultado, comp);
		return resultado;
	
	}
}