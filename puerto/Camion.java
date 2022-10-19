package puerto;

//Puede implementar muchas interfaces! Pero solo puede extender de una clase
public class Camion extends Vehiculo implements Comparable<Camion>, ElementoComparable {

	private String patente;
	private int modelo;
	private int fechaCarga;
	
	public Camion(String patente, int modelo, int fechaCarga) {
		this.patente = patente;
		this.modelo = modelo;
		this.setFechaCarga(fechaCarga);
	}

	public String getPatente() {
		return patente;
	}

	public int getModelo() {
		return modelo;
	}

	public int getFechaCarga1() {
		return fechaCarga;
	}

	public void setFechaCarga(int fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	
	public String toString() {
		return this.patente + ", " + this.fechaCarga;
	}

	@Override
	public boolean esMayor(Object o) {
		Camion aux = (Camion) o;
		return this.getFechaCarga1() < aux.getFechaCarga1();
	}

	@Override
	public boolean esMenor(Object o) {
		Camion aux = (Camion) o;
		return this.getFechaCarga1() > aux.getFechaCarga1();
	}

	@Override
	public int compareTo(Camion o) {
		if (this.getFechaCarga1() < o.getFechaCarga1())
			return 1;
		else if (this.getFechaCarga1() > o.getFechaCarga1())
			return -1;
		else 
			return 0;
	}

	public int getFechaCarga() {
		// TODO Auto-generated method stub
		return 0;
	}

}
