package trabajoEspecial2022;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Alumno>{
	Comparator<Alumno> comp1;
	Comparator<Alumno> comp2;
	
	public ComparadorCompuesto(Comparator<Alumno> comp1, Comparator<Alumno> comp2){
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int resultado;
		resultado = comp1.compare(o1, o2);
			if(resultado == 0);
				comp2.compare(o1, o2);
			return resultado;
	}
}
