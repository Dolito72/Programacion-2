package futbol_5;

import java.util.ArrayList;

public class Socio{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean cuotaPaga;
	private ArrayList<Alquiler>alquileres;
	
	public Socio (String nombre, String apellido, int edad, boolean cuotaPaga){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cuotaPaga = cuotaPaga;
		this.alquileres = new ArrayList<>();
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCuotaPaga() {
		return cuotaPaga;
	}

	public void setCuotaPaga(boolean cuotaPaga) {
		this.cuotaPaga = cuotaPaga;
	}
	
	public void addAlquiler(Alquiler a){
		if (!this.alquileres.contains(a))
			this.alquileres.add(a);
	}

	public boolean alquiloCancha(String cancha){
		return (alquileres.contains(cancha));
				
	}
	
	public boolean alquilerMayorA (int precio){
		for (Alquiler a:alquileres){
			if (a.getPrecio()> precio)
			return true;
		}
		return false;
	}
	
	public int cantidadTotalAlquilerCancha(String cancha){
		int cantidadTotal = 0;
		for (Alquiler a:alquileres){
			if (a.getCancha().equals(cancha)){
			cantidadTotal += 1;
			}
		}
		return cantidadTotal;
	}
	
	@Override
	public boolean equals(Object obj) {
		try{
			Socio otro = (Socio)obj;
			return this.getNombre().equals(otro.getNombre()) && this.getApellido().equals(otro.getApellido());
		}
		catch (Exception e){
		return false;
		}
	}
}
