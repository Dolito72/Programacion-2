package practico_3_ej_1;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<EncuestaRespondida> encuestasRespondidas;
	private double plusSueldo;
	private ArrayList<Empleado> empleados;
	
	public Empresa(double plusSueldo) {
		this.plusSueldo = plusSueldo;
		encuestasRespondidas = new ArrayList<>();
		empleados = new ArrayList<>();
	}

	public double getPlusSueldo() {
		return plusSueldo;
	}

	public void setPlusSueldo(double plusSueldo) {
		this.plusSueldo = plusSueldo;
	}
	
	public void addEncuestaRespondida(EncuestaRespondida e1){
		if(!encuestasRespondidas.contains(e1)){
			encuestasRespondidas.add(e1);
		}
	}
	public int CantidadEncuestasRespondidas(Empleado e){
		int cant = 0;
		for (EncuestaRespondida er : encuestasRespondidas){
			if(er.getEmpleado().equals(e))
				cant++;
			
		}
		return cant;
	}
	
	public void cobrarPlus(Empleado e){
		int cant = CantidadEncuestasRespondidas(e);
		plusSueldo = e.getSueldo()*cant ;
	}
}