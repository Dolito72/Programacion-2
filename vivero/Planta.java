package vivero;

import historiador.Documento;

import java.util.ArrayList;

public class Planta{
	private String nombreCientifico;
	private ArrayList<String>nombresVulgares;
	private String clasificacion;
	private String familia;
	private String clase;
	private Boolean interior;
	private int sol;
	private int riego;
	
	public Planta(String nombreCientifico, String clasificacion, String familia, String clase, Boolean interior, int sol, int riego){
		this.nombreCientifico = nombreCientifico;
		this.nombresVulgares = new ArrayList<>();
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.interior = interior;
		this.sol = sol;
		this.riego = riego;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public void addNombreVulgar(String n){
		if (!this.nombresVulgares.contains(n)){
			this.nombresVulgares.add(n);
		}
	}
	
	public Boolean getInterior() {
		return interior;
	}

	public void setInterior(Boolean interior) {
		this.interior = interior;
	}

	public boolean tieneNombreVulgar(String n){
		return this.nombresVulgares.contains(n);
	}
	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getSol() {
		return sol;
	}

	public void setSol(int sol) {
		this.sol = sol;
	}

	public int getRiego() {
		return riego;
	}

	public void setRiego(int riego) {
		this.riego = riego;
	}
	
	public boolean equals(Object o){
		try{
			Planta p = (Planta)o;
			return this.getNombreCientifico().equals(p.getNombreCientifico());
		}
		catch(Exception e){
			return false;
		}
	}


}