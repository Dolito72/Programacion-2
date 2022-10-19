package parcialito4;

public  class FiltroNot extends Filtro{
	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar){
		this.filtroANegar = filtroANegar;
	}
	@Override
	public boolean cumple(Empleado e) {
		return  !this.filtroANegar.cumple(e);
	}

}
