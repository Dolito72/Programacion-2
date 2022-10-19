package farmacia;

import java.util.ArrayList;

public class Medicamento implements Comparable<Medicamento> {

	private String nombre;
	private String lab;
	private ArrayList<String> sintomas;
	private int precio;

	public Medicamento(String nombre, String lab, int precio) {
		this.nombre = nombre;
		this.lab = lab;
		this.sintomas = new ArrayList<>();
		this.precio = precio;
	}

	public void addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}

	public int getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLab() {
		return lab;
	}
	
	public boolean trataSintoma(String sintoma) {
		return this.sintomas.contains(sintoma);
	}
	
	public ArrayList<String> getSintomas() {
		return new ArrayList<>(this.sintomas);
	}
	
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Medicamento otro) {
		return this.getNombre().compareTo(otro.getNombre());
	}

}
