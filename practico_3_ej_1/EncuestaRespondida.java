package practico_3_ej_1;

import java.util.ArrayList;
public class EncuestaRespondida {
	private Empleado empleado;
	private Cliente cliente;
	private ArrayList<String> preguntas;

	public EncuestaRespondida(Empleado empleado, Cliente cliente){
		this.empleado = empleado;
		this.cliente = cliente;
		preguntas = new ArrayList<>();
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public boolean equals(Object obj) {
		EncuestaRespondida otra = (EncuestaRespondida) obj;
		return this.equals(otra);
	}
	
	
}
