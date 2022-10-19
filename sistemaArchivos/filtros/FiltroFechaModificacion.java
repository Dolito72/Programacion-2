package sistemaArchivos.filtros;

import java.time.LocalDate;

import sistemaArchivos.Elemento;
import sistemaArchivos.filtros.Filtro;

public class FiltroFechaModificacion extends Filtro{
	LocalDate fechaAnterior;
	
	public FiltroFechaModificacion(LocalDate fechaAnterior){
		this.fechaAnterior = fechaAnterior;
	}
	@Override
	public boolean cumple(Elemento e) {
		return e.getFechaCreacion().isAfter(fechaAnterior);
	}

}
