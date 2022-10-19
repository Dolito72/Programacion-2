package vivero;

import java.util.ArrayList;

import vivero.filtros.Filtro;

public class Vivero {
	ArrayList<Planta>plantas;
	
	public Vivero(){
		this.plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta p){
		if(!this.plantas.contains(p)){
			this.plantas.add(p);
		}
	}
	
	public ArrayList<Planta> buscadorPlantas(Filtro f){
		ArrayList<Planta> resultado = new ArrayList<>();
			for(Planta p:plantas){
				if (f.cumple(p)){
					resultado.add(p);
				}
			}
			return resultado;
	}
}
