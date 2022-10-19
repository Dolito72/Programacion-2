package practico_3_ej_3;

public class Personaje {
	private String nombre;
	private int visionNocturna;
	private int velocidad;
	private int fuerza;
	private int peso;
	private int altura;
	private int edad;
	
	public Personaje(String nombre, int visionNocturna, int velocidad, int fuerza, int peso, int altura, int edad){
		this.nombre = nombre;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(int visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Personaje otro = (Personaje) obj;
		return this.getNombre().equals(otro);
	}
}
