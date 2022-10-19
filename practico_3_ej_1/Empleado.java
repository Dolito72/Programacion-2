package practico_3_ej_1;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private String apellido;
	private double sueldo;
	private ArrayList<EncuestaRespondida> encuestasRespondidas;
	
	public Empleado(String nombre, String apellido, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		encuestasRespondidas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void addEncuestasRespondidas(EncuestaRespondida e1){
		if (!encuestasRespondidas.contains(e1))
			encuestasRespondidas.add(e1);
	}

	@Override
	public boolean equals(Object obj) {
		Empleado otro = (Empleado) obj;
		return (this.getNombre().equals(otro.getNombre()) && this.getApellido().equals(otro.getApellido()));
	}
	
	
}
