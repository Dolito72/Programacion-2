package practico_7a_ej_1;

import java.util.ArrayList;

import practico_7a_ej_1.filtros.Filtro;

public class Agr�cola {
	private String nombre;
	ArrayList<ProductoQuimico> agroquimicos;
	//ArrayList<Cultivo>cultivos;
	ArrayList<Enfermedad> enfermedades;
	
	public Agr�cola (String nombre){
		this.nombre = nombre;
		this.agroquimicos = new ArrayList<>();
		//this.cultivos = new ArrayList<>();
		this.enfermedades = new ArrayList<>();
	}
	
	public ArrayList<ProductoQuimico> buscarAgroqu�micos(Filtro f){
		ArrayList <ProductoQuimico> resultado = new ArrayList<>();
		for(ProductoQuimico p: agroquimicos)
				if (f.cumple(p)){
				resultado.add(p);
				}
		return resultado;
	}
	
}
