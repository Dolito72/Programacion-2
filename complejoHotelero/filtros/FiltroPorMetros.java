package complejoHotelero.filtros;

import complejoHotelero.Habitacion;

public class FiltroPorMetros extends Filtro{
	private int metrosMinimos;

	public FiltroPorMetros(int metrosMinimos){
		this.metrosMinimos = metrosMinimos;
	}
	@Override
	public boolean cumple(Habitacion h) {
		return h.getMetros()> metrosMinimos;
	}

}
