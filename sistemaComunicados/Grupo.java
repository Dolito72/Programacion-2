package sistemaComunicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemaComunicados.filtros.Filtro;

public class Grupo extends Elemento{
	ArrayList<Elemento> empleados;
	Filtro filtro;
	
	public Grupo(Filtro filtro){
		this.empleados = new ArrayList<>();
		this.filtro = filtro;
	}
	
	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	public void agregarEmpleado(Elemento empleado){
		this.empleados.add(empleado);
	}

	
	public void agregarNotificacion(Notificacion n) {
		if (filtro.cumple(n)){
			for(Elemento e:empleados){
				e.agregarNotificacion(n);
			}
		}
	}
	@Override
	public int getCantidadEmpleados() {
		int cantidad = 0;
		for (Elemento e: empleados){
			cantidad += e.getCantidadEmpleados();
		}
		return cantidad;
	}

	@Override
	public int getCantidadNotificaciones() {
		int cantidad = 0;
		for (Elemento e:empleados){
			cantidad += e.getCantidadNotificaciones();
		}
		return cantidad;
	}

	public ArrayList<Empleado> listar(Comparator comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for (Elemento e:empleados){
			ArrayList<Empleado> listaHija = e.listar(comp);
				for(Empleado l:listaHija)
					if (!resultado.contains(l))
					resultado.add(l);
		}
		Collections.sort(resultado, comp);
		return resultado;
	}

	@Override
	public ArrayList<Empleado> listaEmpleados(Filtro f) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for (Elemento e:empleados){
			ArrayList<Empleado> listaHija =  e.listaEmpleados(f);
				for(Empleado l:listaHija)
					if (!resultado.contains(l))
					resultado.add(l);
		}
		return resultado;
	}

}
