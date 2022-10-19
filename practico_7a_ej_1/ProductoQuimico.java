
package practico_7a_ej_1;

import java.util.ArrayList;

public class ProductoQuimico{
	private String nombre;
	private ArrayList<EstadoPatologico> estadosPatologicos;
	private ArrayList<Cultivo> cultivosDesaconsejados;
	
	public ProductoQuimico(String nombre){
		this.nombre = nombre;
		this.estadosPatologicos = new ArrayList<>();
		this.cultivosDesaconsejados = new ArrayList<>();
	}
	
	public void addSintoma (EstadoPatologico e){
		this.estadosPatologicos.add(e);
	}
	
	public void addCultivo (Cultivo c){
		this.cultivosDesaconsejados.add(c);
	}
	
	public boolean contieneCultivoDesaconsejado(Cultivo c){
		return this.cultivosDesaconsejados.contains(c);
	}
	public boolean trataEstadoPatologico(EstadoPatologico e){
		return estadosPatologicos.contains(e);
	}

	public ArrayList<EstadoPatologico> getSintomas() {
		return new ArrayList<>(this.estadosPatologicos);
	}

	
	@Override
	public String toString() {
		return this.nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}