package libreria;

import java.util.ArrayList;

import libreria.comportamientos.Comportamiento;

public class Cliente {
	private String nombre;
	private String dni;
	private String direccion;
	private ArrayList<String> autoresPreferidos;
	protected ArrayList<String> generosPreferidos;
	private ArrayList<Articulo> compras;
	private double descuento;
	private Comportamiento comp;
	
	public Cliente(String nombre, String dni, String direccion, double descuento, Comportamiento comp) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.autoresPreferidos = new ArrayList<>();
		this.generosPreferidos = new ArrayList<>();
		this.compras = new ArrayList<>();
		this.descuento = descuento;
		this.comp = comp;
	}
	
	public void setComportamiento(Comportamiento c) {
		this.comp = c;
	}
	
	public void addAutor(String autor) {
		if (!this.autoresPreferidos.contains(autor))
			this.autoresPreferidos.add(autor);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDescuento() {
		return this.descuento;
	}
	
	public boolean yaCompraste(Articulo a) {
		return this.compras.contains(a);
	}
	
	public boolean meGusta(Articulo a) {
		return this.comp.leGusta(a, this);
	}
	
	public boolean leGustaAutor(String autor) {
		return this.autoresPreferidos.contains(autor);
	}

	public ArrayList<String> getGenerosPreferidos() {
		return new ArrayList<>(this.generosPreferidos);
	}
	
}
