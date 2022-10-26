package aseguradora.filtros;

import aseguradora.SeguroSimple;

public class FiltroPorDni extends Filtro{
	private int dniBuscado;
	
	public FiltroPorDni(int dniBuscado){
		this.dniBuscado = dniBuscado;
	}
	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getDni() == this.dniBuscado;
	}

}
