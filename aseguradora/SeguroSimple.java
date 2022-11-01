package aseguradora;

import java.util.ArrayList;
import aseguradora.calculadores.CalculadorCosto;
import aseguradora.filtros.Filtro;

public class SeguroSimple extends Seguro {
	private int dni;
	private String descripcion;
	private int numeroPoliza;
	private int montoAsegurado;
	private CalculadorCosto calculador;

	public SeguroSimple(int dni, String descripcion, int numeroPoliza, int montoAsegurado, CalculadorCosto calculador){
		this.dni = dni;
		this.numeroPoliza = numeroPoliza;
		this.descripcion = descripcion;
		this.montoAsegurado = montoAsegurado;
		this.calculador = calculador;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumeroPoliza(){
		return numeroPoliza;
	}
	
	public void setCalculador (CalculadorCosto nuevoCalculador){
		this.calculador = nuevoCalculador;
	}
	@Override
	public int calcularMontoAsegurado() {
		return montoAsegurado;
	}

	@Override
	public double getCosto() {
		return calculador.calcularCosto(this);
	}

	@Override
	public ArrayList<SeguroSimple> buscarSeguros(Filtro f) {
		ArrayList<SeguroSimple> resultado = new ArrayList<>();
			if (f.cumple(this))
				resultado.add(this);
		return resultado;
	}
}
