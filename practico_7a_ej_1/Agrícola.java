package practico_7a_ej_1;

import java.util.ArrayList;

import practico_7a_ej_1.filtros.Filtro;

public class Agrícola {
	private String nombre;
	ArrayList<ProductoQuimico> agroquimicos;
	//ArrayList<Cultivo>cultivos;
	ArrayList<Enfermedad> enfermedades;
	
	public Agrícola (String nombre){
		this.nombre = nombre;
		this.agroquimicos = new ArrayList<>();
		//this.cultivos = new ArrayList<>();
		this.enfermedades = new ArrayList<>();
	}
	
	public ArrayList<ProductoQuimico> buscarAgroquímicos(Filtro f){
		ArrayList <ProductoQuimico> resultado = new ArrayList<>();
		for(ProductoQuimico p: agroquimicos)
				if (f.cumple(p)){
				resultado.add(p);
				}
		return resultado;
	}
	
}
