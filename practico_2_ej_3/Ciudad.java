package practico_2_ej_3;
/*Un pa�s tiene que controlar el gasto p�blico de las ciudades con m�s de 100.000
habitantes. Para ello, tiene informaci�n del monto recaudado por cada ciudad a trav�s de
cinco diferentes tipos de impuestos (denominados, aqu�, de imp1, imp2, imp3, imp4 e
imp5) e informaci�n acerca de gastos realizados en mantenimiento de la ciudad. Este
pa�s necesita un sistema que le informe cuales son las ciudades que gastan m�s de lo
que recaudan, y las provincias que tienen mas de la mitad de las ciudades en condici�n
de d�ficit.
Consejo: Tener en cuenta la informaci�n que contienen los distintos impuestos
Extra: �En que afecta el tama�o de la ciudad? */

public class Ciudad {
	private String nombreCiudad;
	private int cantidad_habitantes;
	private int imp_1;
	private int imp_2;
	private int imp_3;
	private int imp_4;
	private int imp_5;
	private int gastosRealizados;
	
	public Ciudad (String nombreCiudad, int cantidad_habitantes, int imp_1, int imp_2,
	int imp_3, int imp_4, int imp_5, int gastosRealizados){
		this.setNombreCiudad(nombreCiudad);
		this.setCantidad_habitantes(cantidad_habitantes);
		this.setImp_1(imp_1);
		this.setImp_2(imp_2);
		this.setImp_3(imp_3);
		this.setImp_4(imp_4);
		this.setImp_5(imp_5);
		this.setGastosRealizados(gastosRealizados);
	}

	public String getNombre_ciudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public int getCantidad_habitantes() {
		return cantidad_habitantes;
	}

	public void setCantidad_habitantes(int cantidad_habitantes) {
		this.cantidad_habitantes = cantidad_habitantes;
	}

	public int getImp_1() {
		return imp_1;
	}

	public void setImp_1(int imp_1) {
		this.imp_1 = imp_1;
	}

	public int getImp_2() {
		return imp_2;
	}

	public void setImp_2(int imp_2) {
		this.imp_2 = imp_2;
	}

	public int getImp_3() {
		return imp_3;
	}

	public void setImp_3(int imp_3) {
		this.imp_3 = imp_3;
	}

	public int getImp_4() {
		return imp_4;
	}

	public void setImp_4(int imp_4) {
		this.imp_4 = imp_4;
	}

	public int getImp_5() {
		return imp_5;
	}

	public void setImp_5(int imp_5) {
		this.imp_5 = imp_5;
	}
	public int getGastosRealizados() {
		return gastosRealizados;
	}

	public void setGastosRealizados(int gastosRealizados) {
		this.gastosRealizados = gastosRealizados;
	}
	
	public int totalImpuestos(){
		return (getImp_1() + getImp_2() + getImp_3()+ getImp_4() + getImp_5());
	}
	
	public boolean gastaMasDeLoQueRecauda(){
		return (getGastosRealizados() > totalImpuestos());
			
	}
}