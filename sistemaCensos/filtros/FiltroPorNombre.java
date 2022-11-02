package sistemaCensos.filtros;

import sistemaCensos.Comarca;

public class FiltroPorNombre extends Filtro {
	private String nombreBuscado;
	
	public FiltroPorNombre (String nombreBuscado){
		this.nombreBuscado = nombreBuscado;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.getNombre().equals(nombreBuscado);
	}

}
