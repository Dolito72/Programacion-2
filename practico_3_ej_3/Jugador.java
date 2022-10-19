package practico_3_ej_3;

import java.util.ArrayList;
import java.util.Random;
public class Jugador {
	String nombre;
	private ArrayList<Personaje> personajes;
	
	public Jugador(String nombre){
		this.nombre = nombre;
		personajes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addPersonaje(Personaje p1){
		if(!personajes.contains(p1)){
			this.personajes.add(p1);
		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Jugador otro = (Jugador) obj;
		return this.getNombre().equals(otro);
	}

	public Personaje elegirPersonaje(){
		return this.personajes.get((int)Math.random()*personajes.size());
	}
}