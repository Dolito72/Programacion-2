package practico_3_ej_3;

import java.util.ArrayList;
public class Juego {
	ArrayList<Jugador> jugadores;
	
	public Juego(){
		jugadores = new ArrayList<>();
	}
	
	public void addJugador(Jugador j1){
		if(!jugadores.contains(j1)){
			jugadores.add(j1);
		}
	}
	
	public String ganador(Jugador j1, Jugador j2){
		Personaje p1 = j1.elegirPersonaje();
		Personaje p2 = j2.elegirPersonaje();
		if((p1.getFuerza()>p2.getFuerza()) || (p1.getVelocidad()>p2.getVelocidad()) || (p1.getVisionNocturna()>p2.getVisionNocturna())){
			return "Ganó  " + j1.getNombre();
		}
		else if( (p1.getFuerza()== p2.getFuerza()) && (p1.getVelocidad()==p2.getVelocidad())&& (p1.getVisionNocturna()==p2.getVisionNocturna())){
			return "Empataron  " +j1.getNombre() + j2.getNombre();
		}
		else 
			return "Ganó  " + j2.getNombre();
	}
		
}
