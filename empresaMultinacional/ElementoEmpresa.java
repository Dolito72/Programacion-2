package empresaMultinacional;

import java.util.ArrayList;

import empresaMultinacional.filtros.Filtro;

public abstract class ElementoEmpresa {
	
	public abstract int getCantidadEmpleados();
	public abstract double gastoSueldos();
	public abstract ArrayList<Empleado>empleadosCon(Filtro f);

}
