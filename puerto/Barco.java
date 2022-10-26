package puerto;

public class Barco implements Comparable<Barco> {

	private String nombre;
	private String capitan;
	private int capacidad;

	public Barco(String nombre, String capitan, int capacidad) {
		this.nombre = nombre;
		this.setCapitan(capitan);
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCapitan() {
		return capitan;
	}

	public void setCapitan(String capitan) {
		this.capitan = capitan;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	public String toString() {
		return this.nombre + ", " + this.capacidad;
	}

	@Override
	public int compareTo(Barco o) {
		if (this.getCapacidad() > o.getCapacidad())
			return 1;
		else if (this.getCapacidad() < o.getCapacidad())
			return -1;
		else
			return 0;
	}

	
}
