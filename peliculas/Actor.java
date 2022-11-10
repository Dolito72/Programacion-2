package peliculas;

import java.util.ArrayList;

public class Actor {
	private String nombre;
	private String apellido;
	private int anoNacimiento;
	private ArrayList<Pelicula> peliculas;
	
	public Actor(String nombre, String apellido, int añoNacimiento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.anoNacimiento = anoNacimiento;
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

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	public void agregarPelicula(Pelicula p){
		peliculas.add(p);
	}
	
	public boolean equals (Object obj){
		try{
			Actor otro = (Actor) obj;
			return this.getNombre().equals(otro.getApellido())&& this.getApellido().equals(otro.getApellido());
		}
		catch(Exception e){
			return false;
		}
	}
	
}
