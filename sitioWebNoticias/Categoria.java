package sitioWebNoticias;

import java.util.ArrayList;

import aseguradora.Seguro;
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
	public ArrayList<String> mapaDeSitio() {
		ArrayList<String> resultado = new ArrayList<>();
		resultado.add(this.getNombre()+ "\\" );
		for (ElementoNoticia e: noticias) {
			ArrayList<String> resultadoHijo = e.mapaDeSitio();
			for (String s: resultadoHijo)
				resultado.add(this.getNombre() + "\\" + s);
		}
		return resultado;
	}
	
	@Override
	public ArrayList<ElementoNoticia> listadoNoticias(Filtro f) {
		ArrayList<ElementoNoticia> resultado =  new ArrayList<>();
		for (ElementoNoticia e:noticias){
			ArrayList<ElementoNoticia> resHijo = e.listadoNoticias(f);
				resultado.addAll(resHijo);
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}

}
