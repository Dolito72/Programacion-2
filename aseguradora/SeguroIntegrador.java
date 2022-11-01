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
	public int getNumeroPoliza() {
		int numeroMayor = 0;
		for (Seguro s:seguros)
			if (s.getNumeroPoliza() > numeroMayor){
				numeroMayor = s.getNumeroPoliza();
			}
		return numeroMayor;
	}

	@Override
	public double getCosto() {
		double suma = 0.0;
		for (Seguro s: seguros)
			suma += s.getCosto();
		return suma;
	}
	
	@Override
	public ArrayList<SeguroSimple> buscarSeguros(Filtro f) {
		ArrayList<SeguroSimple>resultado = new ArrayList<>();
		for (Seguro s:seguros){
			ArrayList<SeguroSimple> seguroHijo = s.buscarSeguros(f);
			resultado.addAll(seguroHijo);
		}
		return resultado;
	}

	@Override
	public int getDni() {
		return this.getDni();
	}

}
