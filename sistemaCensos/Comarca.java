package sistemaCensos;

import java.util.ArrayList;

import sistemaCensos.filtros.Filtro;

public class Comarca extends Elemento{
	private int superficie;
	private int cantidadHabitantes;
	private int ingresos;

	public Comarca(String nombre, int superificie, int cantidadHabitantes, int ingresos) {
		super(nombre);
		this.superficie = superficie;
		this.cantidadHabitantes = cantidadHabitantes;
		this.ingresos = ingresos;
	}

	@Override
	public int CantidatotalHabitantes() {
		return this.cantidadHabitantes;
	}

	@Override
	public int SuperficieTotal() {
		return this.superficie;
	}

	@Override
	public int IngresosTotales() {
		return this.ingresos;
	}

	@Override
	public ArrayList<Comarca> ListadoComarcasCon(Filtro f) {
		ArrayList<Comarca> resultado = new ArrayList<>();
			if(f.cumple(this))
				resultado.add(this);
		return resultado;
	}

}
