package practico_2_ej_2;


import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalTime;
public class Reunion {
	private String tema;
	private String lugar;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	protected ArrayList<Participante>participantes;
	
	public Reunion (String tema, String lugar, LocalTime horaInicio, LocalTime horaFin){
		this.tema = tema;
		this.lugar =lugar;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.participantes = new ArrayList<Participante>();
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	
	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void addParticipante(Participante p1){
		if (!this.participantes.contains(p1)){
			participantes.add(p1);
		}
	}

	
	public boolean tengoConflicto(Reunion otraReunion) {
		boolean empiezaAntesDeQueTermine = (this.getHoraInicio().isBefore(otraReunion.getHoraFin()));
		boolean terminaDespuesDeQueEmpieze = (this.getHoraFin().isAfter(otraReunion.getHoraInicio()));
		if (empiezaAntesDeQueTermine && terminaDespuesDeQueEmpieze)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Tema: " +getTema()+", Lugar: " + getLugar();
	}

	public Collection<? extends Participante> getParticipantes() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
