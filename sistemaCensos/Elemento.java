
package sistemaCensos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaCensos.filtros.Filtro;

public abstract class Elemento{
	protected String nombre;
	
	public Elemento(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public  double IngresoPerCapita(){
		return this.IngresosTotales()/this.CantidatotalHabitantes();
	}
	public  double DensidadPoblacion(){
		return this.CantidatotalHabitantes()/this.SuperficieTotal();
	}

	public abstract int CantidatotalHabitantes();
	public abstract int SuperficieTotal();
	public abstract int IngresosTotales();
	public abstract ArrayList<Comarca> ListadoComarcasCon(Filtro f);
	public ArrayList<Comarca> ListadoComarcasConOrdenado(Filtro f, Comparator comp){
		ArrayList<Comarca> resultado = this.ListadoComarcasCon(f);
		Collections.sort(resultado, comp);
		return resultado;
	}
}