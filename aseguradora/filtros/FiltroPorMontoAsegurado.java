package aseguradora.filtros;

import aseguradora.SeguroSimple;

public class FiltroPorMontoAsegurado extends Filtro{
	private int montoMinimo;
	
	public FiltroPorMontoAsegurado(int montoMinimo){
		this.montoMinimo = montoMinimo;
	}

	@Override
	public boolean cumple(SeguroSimple s) {
		return s.calcularMontoAsegurado()> montoMinimo;
	}

}
