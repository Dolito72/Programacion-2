package futbol_5.filtros;

import futbol_5.Socio;

public class FiltroPrecioCanchaMayor extends Filtro {
	private int precioMayor;
	
	public FiltroPrecioCanchaMayor(int precioMayor){
		this.precioMayor = precioMayor;
	}
	@Override
	public boolean cumple(Socio s) {
		return s.alquilerMayorA(precioMayor);
	}

}
