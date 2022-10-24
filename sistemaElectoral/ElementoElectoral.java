package sistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoElectoral{
	
	public abstract int cantidadVotos();
	public abstract double porcentajeVotosPorCandidato(Candidato c);
	public abstract double porcentajeVotosEnBlanco(Candidato c);
	public abstract double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin);
	
	public ArrayList<Candidato> ListadoOrdenadoCandidatos(Comparator comp){
		ArrayList<Candidato> resultado = new ArrayList<>();
		Collections.sort(resultado, comp);
		return resultado;
	}
	
}