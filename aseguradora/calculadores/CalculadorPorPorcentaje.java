package aseguradora.calculadores;

import aseguradora.SeguroSimple;

public class CalculadorPorPorcentaje extends CalculadorCosto {
	private double porcentaje;
	
	public CalculadorPorPorcentaje(double porcentaje){
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularCosto(SeguroSimple s) {
		return s.calcularMontoAsegurado()*this.getPorcentaje();
	}

}
