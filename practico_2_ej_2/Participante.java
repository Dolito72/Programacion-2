package practico_2_ej_2;

public class Participante {
	private String nombre;
	private String email;
	private String contacto_telefono;
	
	public Participante(String nombre, String email, String contacto_telefono){
		this.setNombre(nombre);
		this.setEmail(email);
		this.setContacto_telefono(contacto_telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.equals("") ){
			System.out.println("Ingrese un nombre");
		}
		else this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacto_telefono() {
		return contacto_telefono;
	}

	public void setContacto_telefono(String contacto_telefono) {
		this.contacto_telefono = contacto_telefono;
	}

	@Override
	public String toString() {
		return getNombre()+ ", " + getEmail()+", "+getContacto_telefono();
	}

	@Override
	public boolean equals(Object obj) {
		Participante otro = (Participante)obj;
		return this.getNombre().equals(obj);
	}
	
	
	
}
