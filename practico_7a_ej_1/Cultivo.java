package practico_7a_ej_1;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	ArrayList<Enfermedad>enfermedades;
	
	public Cultivo(String nombre){
		this.nombre = nombre;
		this.enfermedades = new ArrayList<>();
	}
	public String getNombre(){
		return nombre;
	}
	public void addEnfermedad(Enfermedad e){
		this.enfermedades.add(e);
	}
	
	public boolean productoQuimicoEsUtil(ProductoQuimico p){
		for(Enfermedad e: enfermedades){
			if (!p.contieneCultivoDesaconsejado(this) && e.trataEnfermedad(p)){
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean equals(Object o) {
		Cultivo otro = (Cultivo) o;
		return this.getNombre().equals(otro.getNombre());
	}
	
	
}
