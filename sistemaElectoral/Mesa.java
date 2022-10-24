package sistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mesa extends ElementoElectoral{
	private ArrayList<Integer> padron;
	private ArrayList<Voto>votos;
	
	public Mesa(){
		this.padron = new ArrayList<>();
		this.votos = new ArrayList<>();
	}

	public void addDni(int dni){
		this.padron.add(dni);
	}
	
	
	public void addVoto(Voto v, int dni){
		if (this.padron.contains(dni)){
			this.votos.add(v);
		}
	}
	@Override
	public int cantidadVotos() {
		return this.votos.size();
	}

	@Override
	public double porcentajeVotosPorCandidato(Candidato c) {
		int cant = 0;
		for (Voto v:votos)
			if (v.getCandidato().equals(c))
				cant++;
		return cant/cantidadVotos()*100;
	}

	@Override
	public double porcentajeVotosEnBlanco(Candidato c) {
		int cantVotosBlanco = 0;
		for (Voto v:votos){
			if (c == null){
			cantVotosBlanco ++;
			}
		}
		return cantVotosBlanco/cantidadVotos()*100;
	}

	@Override
	public double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin) {
		int cant = 0;
		for (Voto v:votos)
			if (v.getHora().isAfter(inicio) && v.getHora().isBefore(fin))
				cant++;
		return cant/cantidadVotos()*100;
	}

}
