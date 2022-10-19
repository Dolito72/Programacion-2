package practico_3_ej_1;

public class Cliente {
	String nombre;
	int dni;

	public Cliente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		Cliente otro = (Cliente)obj;
		return this.getDni()==(otro.getDni());
	}
	
	
}
