package practico_3_ej_1;

import java.util.ArrayList;

public class Encuesta {
	private ArrayList<String> preguntas;
	private ArrayList<EncuestaRespondida> encuestasRespondidas;
	
	public Encuesta(){
		preguntas = new ArrayList<>();
		encuestasRespondidas = new ArrayList<>();
	}
	
	public void addPreguntas(String a){
		if(!preguntas.contains(a))
			preguntas.add(a);
	}
	
	public boolean yaLaHizo(Cliente e) {
		for (EncuestaRespondida er : encuestasRespondidas) {
			if (er.getCliente().equals(e)) {
				return true;
			}
		}
		return false;
	}
}

