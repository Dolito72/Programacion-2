package futbol_5;

import java.time.LocalDate;

public class Alquiler  {
	private String cancha;
	private LocalDate fecha;
	private int id;
	private int precio;
	
	public Alquiler(String cancha, LocalDate fecha, int id, int precio){
		this.cancha = cancha;
		this.fecha = fecha;
		this.id = id;
		this.precio = precio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public String getCancha() {
		return cancha;
	}

	public void setCancha(String cancha) {
		this.cancha = cancha;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		try{
			Alquiler otro = (Alquiler) obj;
			return this.getCancha().equals(otro.getCancha());
		}
		catch (Exception e){
		return false;
		}
	}
	
}
