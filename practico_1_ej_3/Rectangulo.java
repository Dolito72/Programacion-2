package practico_1_ej_3;


public class Rectangulo extends Figura{
	
	double lado1;
	double lado2;
	
	public Rectangulo(double lado1, double lado2) {
       super("Rectangulo");
		this.setLado1(lado1);
        this.setLado2(lado2);
		
	}
	public Rectangulo(double lado1, double lado2, String ss) {
        super(ss);
		this.setLado1(lado1);
        this.setLado2(lado2);
		
	}
	public Rectangulo(String ss) {
        super(ss);
		this.setLado1(10);
        this.setLado2(10);
		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1>= 0) {
			this.lado1 = lado1;
		}
		else {
			this.lado1 = -lado1;
	       // System.out.println("Era Negativo");
		}
		   
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2>= 0)
			this.lado2 = lado2;
		else
			this.lado2 = -lado2;
	}

	
	public double getArea() {
		return lado1*lado2;
	}
	public double getPerimetro() {
		return lado1*2+lado2*2;
	}
	
}

