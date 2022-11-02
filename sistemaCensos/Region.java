package sistemaCensos;

import java.util.ArrayList;

import sistemaCensos.filtros.Filtro;

public class Region extends Elemento {
	private ArrayList<Elemento> regiones;

	public Region(String nombre) {
		super(nombre);
		this.regiones = new ArrayList<>();
	}
	
	public void addRegion (Elemento region){
		this.regiones.add(region);
	}

	@Override
	public int CantidatotalHabitantes() {
		int cantidad = 0;
		for (Elemento e:regiones)
			cantidad += e.CantidatotalHabitantes();
		return cantidad;
	}

	@Override
	public int SuperficieTotal() {
		int totalSup = 0;
		for (Elemento e:regiones)
			totalSup += e.SuperficieTotal();
		return totalSup;
	}

	@Override
	public int IngresosTotales() {
		int ingresosTotales = 0;
		for (Elemento e:regiones)
			ingresosTotales += e.IngresosTotales();
		return ingresosTotales;
	}

	@Override
	public ArrayList<Comarca> ListadoComarcasCon(Filtro f) {
		ArrayList<Comarca> resultado = new ArrayList<>();
		for (Elemento e:regiones){
			ArrayList<Comarca> resultadoHija = e.ListadoComarcasCon(f);
				resultado.addAll(resultadoHija);
		}
		return resultado;
	}

}
