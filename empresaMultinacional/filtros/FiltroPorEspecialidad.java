package empresaMultinacional.filtros;

import empresaMultinacional.Empleado;

public class FiltroPorEspecialidad extends Filtro {
	private String especialidadBuscada;
	
	public FiltroPorEspecialidad(String especialidadBuscada){
		this.especialidadBuscada = especialidadBuscada;
	}

	@Override
	public boolean cumple(Empleado e) {
		return e.getEspecialidad().equals(especialidadBuscada);
	}

}
