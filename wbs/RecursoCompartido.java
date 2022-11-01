package wbs;

public class RecursoCompartido extends Recurso{

	public RecursoCompartido(String nombre) {
		super(nombre);
		
	}
	
	public boolean esPosibleAsignar(Elemento tarea){
		return true;
	}

}
