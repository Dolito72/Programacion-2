package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import sistemaArchivos.filtros.Filtro;

public class ArchivoComprimido extends Directorio {
	private double compresion;
	public ArchivoComprimido(String nombre, LocalDate fechaCreacion, int tamanio, double compresion){
		super(nombre, fechaCreacion, tamanio);
		this.compresion = compresion;
	}

	@Override
	public int getTamanio() {
		return (int) (super.getTamanio() * this.compresion);
	}

	@Override
	public int getCantidadElementos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Elemento> buscarElementos(Filtro filtro) {
		
		return null;
	}

}
