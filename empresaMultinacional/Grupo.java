package empresaMultinacional;

import java.util.ArrayList;

import empresaMultinacional.filtros.Filtro;

public class Grupo extends ElementoEmpresa{
	private String nombre;
	private ArrayList<ElementoEmpresa> elementos;
	
	public Grupo(String nombre){
		this.nombre = nombre;
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoEmpresa e){
		this.elementos.add(e);
	}

	@Override
	public int getCantidadEmpleados() {
		int cantidad = 0;
		for(ElementoEmpresa e:elementos)
			cantidad += e.getCantidadEmpleados();
		return cantidad;
	}

	@Override
	public double gastoSueldos() {
		double totalSueldos = 0.0;
		for (ElementoEmpresa e:elementos)
			totalSueldos += e.gastoSueldos();
		return totalSueldos;
	}

	@Override
	public ArrayList<Empleado>empleadosCon(Filtro f) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for (ElementoEmpresa e:elementos){
			ArrayList<Empleado> resultadoParcial = e.empleadosCon(f);
				resultado.addAll(resultadoParcial);
		}
		return resultado;
	}

}
