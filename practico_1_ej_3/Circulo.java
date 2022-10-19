package practico_1_ej_3;

public class Circulo extends Figura{
double radio;
	
	public Circulo(double rad) {
		super("Circulo");
		radio = rad;
	}
	
	public double getRadio() {
		return radio;
	}
	/**
	 * Crea un Objeto del tipo Circulo
	 * @param radio es el radio del circulo
	 */
	public void setRadio(double radio) {
		if (radio > 0 )
			this.radio = radio;
		else {
			this.radio = -radio;
		}
	}
	
	
	public double getArea() {
		return Math.PI* radio*radio;
	}
	public double getDiametro() {
		return radio*2;
	}
	public double getPerimetro() {
		return Math.PI*getDiametro();
	}
}
