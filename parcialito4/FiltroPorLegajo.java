package parcialito4;

public class FiltroPorLegajo extends Filtro{
	private int legajoMinimo;
	
	public FiltroPorLegajo(int legajoMinimo){
		this.legajoMinimo = legajoMinimo;
	}

	@Override
	public boolean cumple(Empleado e) {
		return e.getLegajo() > this.legajoMinimo;
	}

}
