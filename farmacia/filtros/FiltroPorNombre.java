package farmacia.filtros;
import farmacia.Medicamento;


public class FiltroPorNombre extends Filtro {
	private String nombreBuscado;
	
	public FiltroPorNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getNombre().equals(nombreBuscado);
	}
	
}

