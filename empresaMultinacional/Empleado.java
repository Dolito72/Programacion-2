package empresaMultinacional;

import java.util.ArrayList;

import empresaMultinacional.filtros.Filtro;

public class Empleado extends ElementoEmpresa{
	private String apellido, nombre, especialidad;
	private double sueldo;
	
	public Empleado(String apellido, String nombre, String especialidad, double sueldo){
		this.apellido = apellido;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.sueldo = sueldo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public int getCantidadEmpleados() {
		return 1;
	}

	@Override
	public double gastoSueldos() {
		return this.sueldo;
	}

	@Override
	public ArrayList<Empleado> empleadosCon(Filtro f) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}
	
	
}