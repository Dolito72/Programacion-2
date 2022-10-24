package navidad;

public class Ninio {
	private String nombre;
	private int dni;
	
	public Ninio(String nombre, int dni){
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
		try{
			Ninio otro = (Ninio) obj;
			return this.getDni()== otro.getDni();
		}
		catch (Exception e){
		return false;
		}
	}
	
}
