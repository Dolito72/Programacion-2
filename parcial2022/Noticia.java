package parcial2022;

import java.util.ArrayList;

import parcial2022.filtros.Filtro;

public class Noticia extends Elemento {
	private String titulo;
	private String contenido;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClaves;
	
	public Noticia(String titulo, String contenido, String autor, String categoria){
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
		this.categoria = categoria;
	}
		
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getCategoria() {
		return this.categoria ;
	}
	
	public void addPalabraClave(String p){
		if(!this.palabrasClaves.contains(p))
			this.palabrasClaves.add(p);
	}
	@Override
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<String>(palabrasClaves);
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro f) {
		ArrayList<Noticia> resultado = new ArrayList<Noticia>();
		if(f.cumple(this))
			resultado.add(this);
		return resultado;
	}

}
