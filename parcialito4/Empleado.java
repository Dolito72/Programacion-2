package parcialito4;

import java.util.ArrayList;


public class Empleado {
	private String nombre;
	int legajo;
	ArrayList<String>habilidades;
	
	public Empleado(String nombre, int legajo){
		this.nombre = nombre;
		this.legajo = legajo;
		this. habilidades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public void addHabilidad(String a){
		habilidades.add(a);
	}
	
	public boolean tieneHabilidad(String h){
		return this.habilidades.contains(h);
	}
}
