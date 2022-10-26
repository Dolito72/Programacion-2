package aseguradora.calculadores;

import aseguradora.SeguroSimple;

public class CalculadorSuma extends CalculadorCosto{
	 private CalculadorCosto calc1, calc2;
	
	public CalculadorSuma(CalculadorCosto calc1, CalculadorCosto calc2) {
       this.calc1 = calc1;
        this.calc2 = calc2;
    }

    @Override
	public double calcularCosto(SeguroSimple s) {
		 return calc1.calcularCosto(s) + calc2.calcularCosto(s);
	}
}
