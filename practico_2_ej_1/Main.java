package practico_2_ej_1;

public class Main {

	public static void main(String[] args) {
		
		// Crear una Serie
		Serie s = new Serie("ALF","Comedia","Un extraterrestre llega a vivir con una familia en la tierra","Willy");
		// Agregar unas Temporadas
		Temporada t1 = new Temporada(1);
		t1.addEpisodio(new Episodio("S1E1","Alf llega a la tierra"));
		t1.addEpisodio(new Episodio("S1E2","Alf corre"));
		t1.addEpisodio(new Episodio("S1E3","Alf canta"));
		t1.addEpisodio(new Episodio("S1E4","Alf baila"));
		t1.addEpisodio(new Episodio("S1E5","Alf se va"));
		s.addTemporada(t1);
		Temporada t2 = new Temporada(2);
		t2.addEpisodio(new Episodio("S2E1","Alf llega a la tierra"));
		t2.addEpisodio(new Episodio("S2E2","Alf corre"));
		t2.addEpisodio(new Episodio("S2E3","Alf canta"));
		t2.addEpisodio(new Episodio("S2E4","Alf baila"));
		t2.addEpisodio(new Episodio("S2E5","Alf se va"));
		s.addTemporada(t2);
		
		if (!s.setCalificacion(1,1,4)) {
			System.out.println("Tu calificacion es incorrecta");
		} else {
			System.out.println("Calificacion cargada correctamente");
		}

	}

}
