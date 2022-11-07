package sistemaComunicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaComunicados.filtros.Filtro;

public abstract class Elemento{
	
	public abstract void agregarNotificacion( Notificacion n);
	public abstract ArrayList<Empleado> listar(Comparator comp) ;
	public abstract int getCantidadEmpleados();
	public abstract int getCantidadNotificaciones();
	public abstract ArrayList<Empleado> listaEmpleados(Filtro f);
	public ArrayList<Empleado> listaOrdenadaEmpleados(Filtro f, Comparator comp){
		ArrayList<Empleado> resultado = this.listaEmpleados(f);
		Collections.sort(resultado, comp);
		return resultado;
	}
	
}