package practico_2_ej_2;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Participante p1 = new Participante ("Juan","juan@gmail.com","444444");
		Participante p2 = new Participante ("Dolores","dolo@gmail.com","2222");
		Participante p3 = new Participante ("Pedro","pepe@gmail.com","3333");
		
		Reunion reunion1 = new Reunion ("Estudiar Prog", "Casa Dolo", LocalTime.of(16, 00),LocalTime.of(17,00));
		Reunion reunion2 = new Reunion ("Estudiar Web", "Casa Dolo", LocalTime.of(18, 30), LocalTime.of(19, 30));
		Reunion reunion3 = new Reunion ("Distraerse", "Casa Dolo", LocalTime.of(21,00), LocalTime.of(23, 00));
		
		Agenda agendaDolo = new Agenda ();
		

		reunion1.addParticipante(p1);
		reunion1.addParticipante(p2);
		reunion1.addParticipante(p3);
		
		reunion2.addParticipante(p1);
		reunion2.addParticipante(p2);
		reunion2.addParticipante(p3);
		
		
		reunion3.addParticipante(p2);
		reunion3.addParticipante(p3);
		
		
		agendaDolo.addReuniones(reunion1);
		agendaDolo.addReuniones(reunion2);
		agendaDolo.addReuniones(reunion3);
		
		System.out.println(agendaDolo.cantidadReuniones());
		System.out.println(p1);
		System.out.println(reunion1);
		System.out.println(reunion3);
	}

}
