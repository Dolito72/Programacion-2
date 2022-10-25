package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPorPrecio extends Filtro {
	private double precioBuscado;
	
	public FiltroPorPrecio(double precioBuscado){
		this.precioBuscado = precioBuscado;
	}
	@Override
	public boolean cumple(Medicamento medicamento) {
		return this.precioBuscado == (medicamento.getPrecio());
	}

}
