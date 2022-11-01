package wbs.filtros;

import java.time.LocalDate;

import wbs.Tarea;

public class FiltroPorFechaFinEstimada extends Filtro{
	LocalDate fechaActual = LocalDate.now();

	public FiltroPorFechaFinEstimada(LocalDate fechaActual){
		this.fechaActual = fechaActual;
	}
	@Override
	public boolean cumple(Tarea t) {
		return t.getFechaFinEstimada().isAfter(fechaActual);
	}

}
