package sitioWebNoticias;

import java.util.ArrayList;
import sitioWebNoticias.filtros.Filtro;

public class Categoria extends ElementoNoticia {
	private String nombre;
	private String descripcion;
	private String imagen;
	ArrayList<ElementoNoticia> noticias;
	
	public Categoria(String nombre, String descripcion, String imagen){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.noticias = new ArrayList<>();
	}

	public void addNoticia (ElementoNoticia e){
		this.noticias.add(e);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public int getCantidadNoticias() {
		int cant = 0;
		for (ElementoNoticia e: noticias)
			cant += e.getCantidadNoticias();
		return cant;
	}

	@Override
	public ElementoNoticia copiar(Filtro f) {
		Categoria copiaCategoria = new Categoria(this.getNombre(), this.getDescripcion(), this.getImagen());
		for (ElementoNoticia e: noticias){
			ElementoNoticia eHijo = e.copiar(f);
			if (eHijo != null)
				copiaCategoria.addNoticia(eHijo);
		}
		return copiaCategoria;
	}

	@Override 
	public String toString() {
		String resultado = this.getNombre() + "\\";
		for (ElementoNoticia e:noticias)
			resultado += e.toString();
		return resultado;
	}

	@Override
	public ArrayList<ElementoNoticia> listadoNoticias(Filtro f) {
		ArrayList<ElementoNoticia> resultado =  new ArrayList<>();
		for (ElementoNoticia e:noticias)
			if (f.cumple((Noticia) e))
				resultado.add(e);
		return resultado;
	}

}
