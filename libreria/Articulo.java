package libreria;

import java.util.ArrayList;


public class Articulo {
	
	private String nombre;
	private String autor;
	private double precio;
	private int cantPaginas;
	private String resumen;
	private ArrayList<String> generos;
	
	public Articulo(String nombre, String autor, double precio, int cantPaginas, String resumen) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		this.generos = new ArrayList<>();
	}
	
	public Articulo(String nombre, String autor, double precio, int cantPaginas, String resumen, ArrayList<String> generos) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		this.generos = new ArrayList<>(generos);
	}
	
	public void addGenero(String genero) {
		if (!this.generos.contains(genero))
			generos.add(genero);
	}
	
	//public ArrayList<String> getGeneros() {
	//	return new ArrayList<>(this.generos);
	//}
	
	public String toString() {
		return this.nombre + " - " + this.autor + " - " + this.precio + "\n" + this.generos;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio(Cliente cliente) {
		return this.precio - this.precio * cliente.getDescuento() / 100;
	}
	
	public double getPrecio(){
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public void imprimirGeneros() {
		for (int i = 0; i < this.generos.size(); i++)
			System.out.println(this.generos.get(i));
	}

	public boolean tieneGenero(String genero) {
		return this.generos.contains(genero);
	}
	
}
