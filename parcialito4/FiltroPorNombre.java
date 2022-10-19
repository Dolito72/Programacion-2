package parcialito4;

public class FiltroPorNombre extends Filtro{
private String nombreBuscado;

	public FiltroPorNombre(String nombreBuscado){
		this.nombreBuscado = nombreBuscado;
	}
	@Override
	public boolean cumple(Empleado e){
		return e.getNombre().equals(nombreBuscado);
	}

}
