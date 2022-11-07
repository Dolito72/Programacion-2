package sistemaComunicados;

import java.util.ArrayList;
import java.util.Comparator;

import aseguradora.SeguroSimple;
import sistemaComunicados.filtros.Filtro;

public class Empleado extends Elemento{
	private String nombre;
	private String apellido;
	private int legajo;
	private int edad;
	ArrayList<Notificacion> notificaciones;
	
	public Empleado(String nombre, String apellido, int legajo, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.edad = edad;
		this.notificaciones = new ArrayList<>();
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

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void agregarNotificacion( Notificacion n) {
		if (!this.notificaciones.contains(n))
			this.notificaciones.add(n);
	}

	@Override
	public int getCantidadEmpleados() {
		return 1;
	}

	public ArrayList<Notificacion> getNotificaciones(){
		ArrayList<Notificacion> copia = new ArrayList<>(notificaciones);
		return copia;
	}
	@Override
	public int getCantidadNotificaciones() {
		int cant = 0;
		for (Notificacion n:notificaciones)
			cant += 1;
		return cant;
	}

	public boolean tienePalabra(String palabra){
		return this.notificaciones.contains(palabra);
	}
	
	@Override
	public ArrayList<Empleado> listaEmpleados(Filtro f) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for (Notificacion n: notificaciones){
			if (f.cumple(n)){
				resultado.add(this);
				return resultado;
			}
		}
	return resultado;
}
	public ArrayList<Empleado> listar(Comparator comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		resultado.add(this);
		return resultado;
	}
}
