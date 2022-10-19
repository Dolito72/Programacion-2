package practico_5_ej_5;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	protected ArrayList<String> conocimientos;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		conocimientos = new ArrayList<>();
	}
}
