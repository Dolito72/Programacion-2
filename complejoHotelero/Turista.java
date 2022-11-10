package complejoHotelero;

import complejoHotelero.filtros.Filtro;

public class Turista {
	private String nombre;
	private String ciudad;
	private int edad;
	private Filtro requerimiento;
	
	public Turista (String nombre, String ciudad, int edad, Filtro requerimiento){
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
		this.requerimiento = requerimiento;
	}
	
	public Filtro getRequerimiento() {
		return requerimiento;
	}

	public void setRequerimiento(Filtro requerimiento) {
		this.requerimiento = requerimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean cumpleRequerimiento(Habitacion h){
		return this.getRequerimiento().cumple(h);
	}

	
	
}
