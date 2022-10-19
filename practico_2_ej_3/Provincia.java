package practico_2_ej_3;

import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList<Ciudad> ciudades;

	public Provincia(String nombre) {
		this.setNombre(nombre);
		this.ciudades = new ArrayList<Ciudad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCiudad(Ciudad c1) {
		if (!ciudades.contains(c1)) {
			ciudades.add(c1);
		}
	}

	public int cantidadCiudades() {
		return ciudades.size();
	}

	public String listadoCiudadesQueGastanMas() {
		String listadoCiudades = " ";
		for (int i = 0; i < ciudades.size(); i++) {
			Ciudad c1 = ciudades.get(i);
			if (c1.gastaMasDeLoQueRecauda()) {
				listadoCiudades += ciudades.get(i).getNombre_ciudad();
			}
		}
		return listadoCiudades;
	}

	public boolean tieneMasDeLaMitadEnDeficit() {
		int contador = 0;
		for (int i = 0; i < ciudades.size(); i++) {
			if (ciudades.get(i).gastaMasDeLoQueRecauda()) {
				contador++;
			}
		}
		return ((cantidadCiudades() / 2) <= contador);
	}
}	