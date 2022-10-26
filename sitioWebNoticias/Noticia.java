package sitioWebNoticias;

import java.util.ArrayList;
import sitioWebNoticias.filtros.Filtro;

public class Noticia extends ElementoNoticia {
	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String texto;
	private String autor;
	private String link;
	
	public Noticia(String titulo, String texto, String autor, String link){
		this.titulo = titulo;
		this.palabrasClaves = new ArrayList<>();
		this.texto = texto;
		this.autor = autor;
		this.link = link;
	}
	
	public void addPalabraClave (String p){
		this.palabrasClaves.add(p);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public int getCantidadNoticias() {
		return 1;
	}
	
	public boolean tienePalabraClave(String p){
		return this.palabrasClaves.contains(p);
	}

	@Override
	public ElementoNoticia copiar(Filtro f) {
		if (f.cumple(this)){
			Noticia	noticiaCopia = new Noticia(this.getTitulo(), this.getTexto(), this.getAutor(), this.getLink());
			for (String p: palabrasClaves)
				noticiaCopia.addPalabraClave(p);
			return noticiaCopia;
		}
		return null;
	}

	@Override
	public String toString() {
		return this.getLink();
	}

	@Override
	public ArrayList<ElementoNoticia> listadoNoticias(Filtro f) {
		ArrayList<ElementoNoticia> resultado = new ArrayList<>();
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}

	public int getLargoTexto() {
		return this.getTexto().length();
	}


	public ArrayList<String> mapaDeSitio() {
		ArrayList<String> respuesta = new ArrayList<>();
		respuesta.add(this.getLink());
		return respuesta;
	}
	
	
}
