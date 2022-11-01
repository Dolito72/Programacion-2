package wbs.filtros;

import wbs.Tarea;

public class FiltroPorEstado extends Filtro {
	private String estadoBuscado;
	
	public FiltroPorEstado(String estadoBuscado){
		this.estadoBuscado = estadoBuscado;
	}
	@Override
	public boolean cumple(Tarea t) {
		return t.getEstado().equals(estadoBuscado);
	}

}
