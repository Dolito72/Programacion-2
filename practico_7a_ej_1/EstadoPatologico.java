package practico_7a_ej_1;

import practico_3_ej_3.Personaje;

public class EstadoPatologico {
	String nombre;


public EstadoPatologico(String nombre){
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public boolean equals(Object o) {
	EstadoPatologico otro = (EstadoPatologico) o;
	return this.getNombre().equals(otro.getNombre());
}

}