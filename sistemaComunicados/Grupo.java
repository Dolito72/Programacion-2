package sistemaComunicados;

import java.util.ArrayList;

import sistemaComunicados.filtros.Filtro;

public class Grupo extends Elemento{
	ArrayList<Elemento> empleados;
	
	public Grupo(){
		this.empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Elemento empleado){
		this.empleados.add(empleado);
	}

	@Override
	public void agregarNotificacion(Filtro f, Notificacion n) {
		if (f.cumple(n)){
			for(Elemento e:empleados){
				e.agregarNotificacion(f, n);
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
