package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import sistemaArchivos.filtros.Filtro;

public class Link extends Elemento {

	public Link(String nombre, LocalDate fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion, tamanio);
	}

	@Override
	public int getTamanio() {
		return 1;
	}

	@Override
	public int getCantidadElementos() {
		return 1;
	}
	@Override
	public ArrayList<Elemento> buscarElementos(Filtro filtro) {
		ArrayList<Elemento> resultado = new ArrayList<>();
			if (filtro.cumple(this));
				resultado.add(this);
				return resultado;
	}

}

