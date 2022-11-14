package trabajoEspecial2022;

import java.util.ArrayList;

public class Grupo extends Elemento{
	private ArrayList<Elemento> elementos;

	public Grupo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void agregarElemento(Elemento e){
		this.elementos.add(e);
	}

	@Override
	public int getCantidadAlumnos() {
		int cantidad = 0;
		for(Elemento e:elementos)
			cantidad += e.getCantidadAlumnos();
		return cantidad;
	}

}
