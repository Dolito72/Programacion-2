package sistemaElectoral;

import java.time.LocalDate;

public class Voto {
	private Candidato candidato;
	private LocalDate hora;
	
	public Voto(Candidato candidato, LocalDate hora){
		this.candidato = candidato;
		this.hora = hora;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public LocalDate getHora() {
		return hora;
	}

	public void setHora(LocalDate hora) {
		this.hora = hora;
	}
	
	
}
