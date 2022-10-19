package futbol_5.filtros;

import futbol_5.Socio;

public class FiltroPorEdad extends Filtro {
	private int edadMaxima;
	
	public FiltroPorEdad(int edadMaxima){
		this.edadMaxima = edadMaxima;
	}
	@Override
	public boolean cumple(Socio s) {
		return s.getEdad()< edadMaxima;
	}
	
	

}
