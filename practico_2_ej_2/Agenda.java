package practico_2_ej_2;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Reunion> reuniones;
	private ArrayList<Participante>participantes;

	public Agenda() {
		this.reuniones = new ArrayList<Reunion>();
		this.participantes = new ArrayList<Participante>();
	}
	
	
	public void addParticipante(Participante p1){
		if(!participantes.contains(p1)){
			participantes.add(p1);
		}
	}
	
	public int cantidadReuniones() {
		return reuniones.size();
	}
	
	public void addReuniones(Reunion r1){
		if(!reuniones.contains(r1)){
			reuniones.add(r1);
		}
	}
	
	public void agregarReunionAgenda(Reunion r1){
		boolean hayConflicto = false;
		if(this.reuniones.isEmpty()){
			reuniones.add(r1);
		}
		else {
			for(Reunion r : this.reuniones){
				if(r.tengoConflicto(r1)){
					hayConflicto = true;
				}
			}
			if (!hayConflicto){
				this.reuniones.add(r1);
				this.participantes.addAll(r1.getParticipantes());
			}
		}
	}

}
