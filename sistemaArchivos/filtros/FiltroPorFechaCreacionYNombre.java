package sistemaArchivos.filtros;

import java.time.LocalDate;

import sistemaArchivos.Elemento;

public class FiltroPorFechaCreacionYNombre extends Filtro {
	private LocalDate fechaMaxima;
	private String nombreBuscado;
	
	public FiltroPorFechaCreacionYNombre(LocalDate fechaMaxima, String nombreBuscado){
		this.fechaMaxima = fechaMaxima;
		this.nombreBuscado = nombreBuscado;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getFechaCreacion().isBefore(fechaMaxima) && e.getNombre().equals(nombreBuscado);
	}

}
