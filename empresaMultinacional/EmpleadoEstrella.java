package empresaMultinacional;

import java.util.ArrayList;

import empresaMultinacional.filtros.Filtro;

public class EmpleadoEstrella extends Empleado{

	public EmpleadoEstrella(String apellido, String nombre, String especialidad, double sueldo) {
		super(apellido, nombre, especialidad, sueldo);
	}

	@Override
	public ArrayList<Empleado> empleadosCon(Filtro f) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		resultado.add(this);
		return resultado;
	}
}
