package historiador;

import java.util.ArrayList;

public class Documento{
	private String titulo;
	private ArrayList<String>autores;
	private String contenido;
	private ArrayList<String>palabrasClave;
	
	public Documento(String titulo, String contenidoTextual){
		this.titulo = titulo;
		this.autores = new ArrayList<>();
		this.contenido = contenidoTextual;
		this.palabrasClave = new ArrayList<>();
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public int cantidadPalabras() {
		return this.contenido.split(" ").length;
	}
	public void addAutor(String a){
		if(!this.autores.contains(a))
		this.autores.add(a);
	}

	public boolean tieneAutor(String a){
		return autores.contains(a);
	}
	
	public void addPalabraClave(String p){
		if(!this.palabrasClave.contains(p))
			this.palabrasClave.add(p);
	}
	
	public boolean tienePalabraClave(String p){
		return palabrasClave.contains(p);
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Documento otro = (Documento) o;
			return this.getTitulo().equals(otro.getTitulo());
		} catch (Exception e) {
			return false;
		}
	}
	
	
}