package aseguradora;

import java.util.ArrayList;
import aseguradora.filtros.Filtro;

public class SeguroIntegrador extends Seguro {
	private int dni;
	private ArrayList<Seguro> seguros;

	public SeguroIntegrador(int dni) {
		this.dni = dni;
		this.seguros = new ArrayList<>();
	}

	public void addSeguro(Seguro s){
		this.seguros.add(s);
	}
	
	@Override
	public int calcularMontoAsegurado() {
		int suma = 0;
		for (Seguro s: seguros)
			suma += s.calcularMontoAsegurado();
		return suma;
	}

	@Override
	public int numeroPoliza() {
		int numeroMayor = 0;
		for (Seguro s:seguros)
			if (s.numeroPoliza() > numeroMayor){
				numeroMayor = s.numeroPoliza();
			}
		return numeroMayor;
	}

	@Override
	public double getCosto() {
		int suma = 0;
		for (Seguro s: seguros)
			suma += s.getCosto();
		return suma;
	}
	
	@Override
	public ArrayList<Seguro> buscarSeguros(Filtro f) {
		ArrayList<Seguro>resultado = new ArrayList<>();
		for (Seguro s:seguros){
			ArrayList<Seguro> seguroHijo = s.buscarSeguros(f);
			resultado.addAll(seguroHijo);
		}
		return resultado;
	}

	@Override
	public int getDni() {
		return this.getDni();
	}

}
