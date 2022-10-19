package parcialito4;

public class FiltroPorHabilidad extends Filtro{
	private String habilidadDada;
	public FiltroPorHabilidad(String habilidadDada){
		this.habilidadDada = habilidadDada;
	}
	@Override
	public boolean cumple(Empleado e) {
		return  e.tieneHabilidad(this.habilidadDada);
	}

}
