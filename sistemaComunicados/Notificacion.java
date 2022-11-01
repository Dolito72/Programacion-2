package sistemaComunicados;

import java.time.LocalDate;

public class Notificacion {
	private String listaPalabras;
	private Empleado nombre;
	private LocalDate fecha;
	
	public Notificacion(String listaPalabras, Empleado nombre, LocalDate fecha){
		this.listaPalabras = listaPalabras;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getListaPalabras() {
		return listaPalabras;
	}


	public Empleado getNombre() {
		return nombre;
	}

	public void setNombre(Empleado nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean tienePalabra(String palabra){
		return this.getListaPalabras().contains(palabra);
	}
	
	public int getCantidadPalabras(){
		return this.getListaPalabras().split(" ").length;
	}
}
