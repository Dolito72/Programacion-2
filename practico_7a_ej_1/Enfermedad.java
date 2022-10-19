package practico_7a_ej_1;

import java.util.ArrayList;

import practico_7a_ej_1.filtros.Filtro;

public class Enfermedad {
	private String nombre;
	private ArrayList<EstadoPatologico> estadosPatologicos;
	
	public Enfermedad(String nombre){
		this.nombre = nombre;
		this.estadosPatologicos = new ArrayList<>();
	}
	
	public void AddSintoma (EstadoPatologico e){
		this.estadosPatologicos.add(e);
	}
	
	public boolean tieneSintoma(EstadoPatologico a){
		return estadosPatologicos.contains(a);
	}
	
	public boolean trataEnfermedad(ProductoQuimico p){
		for(EstadoPatologico e: estadosPatologicos) {
				if (!p.trataEstadoPatologico(e)){
					return false;
				}
		}
		return true;
	}
	}
