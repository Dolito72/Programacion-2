package parcialito4;

import java.util.ArrayList;

public class Casa{
	private ArrayList<Empleado> empleados;
	
	public Casa(){
		this.empleados = new ArrayList<>();
	}
	
	public ArrayList<Empleado>buscar(Filtro f){
		ArrayList<Empleado> resultado = new ArrayList<>();
		for (Empleado e:empleados)
			if (f.cumple(e))
				resultado.add(e);
		return resultado;
	}
}


	