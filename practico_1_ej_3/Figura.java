package practico_1_ej_3;

public class Figura {
	private String nombre;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	public double getArea() {
		return 0;
	}
	public double getPerimetro() {
		return 0;
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getValoresFinales() {
		return this.getArea()+this.getPerimetro();
	}
	
	public double[] getValoresArreglo() {
		double[] valores = new double[2];
		valores[0]= this.getArea();
		valores[1]= getPerimetro();
		return valores;
	}
	
	/*public boolean diferentes(Figura f1, Figura f2){
		return !f1.equals(f2);
	}*/
}
