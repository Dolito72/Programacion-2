package libreria;

import libreria.comportamientos.Comportamiento;
import libreria.comportamientos.ComportamientoExigente;
import libreria.comportamientos.ComportamientoGustaTodo;

public class Main {
	public static void main(String[] args) {
		Articulo libro = new Articulo("Rayuela", "Cortazar", 1000, 10, "");
		
		Comportamiento comp1 = new ComportamientoExigente();
		
		Cliente c1 = new Cliente("Ariel", "2", "Tandil", 45.0, comp1);
		
		System.out.println(c1.meGusta(libro));
		
		Comportamiento comp2 = new ComportamientoGustaTodo();
		
		c1.setComportamiento(comp2);
		
		System.out.println(c1.meGusta(libro));

	}
}
