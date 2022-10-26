package aseguradora.calculadores;

import aseguradora.SeguroSimple;

public class CalcularCostoPorMontoFijo extends CalculadorCosto {
	private double montoFijo;
	
	public CalcularCostoPorMontoFijo(double montoFijo){
		this.montoFijo = montoFijo;
	}

	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	@Override
	public double calcularCosto(SeguroSimple s) {
		return this.getMontoFijo();
	}

}
