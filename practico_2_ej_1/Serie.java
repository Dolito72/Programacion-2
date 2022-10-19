package practico_2_ej_1;
/*Para cada una de los siguientes problemas identificar los objetos que intervienen, su
estado y su comportamiento. Implementar en Java
1 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementar en Java.
Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
Obtener el total episodios vistos de una temporada particular.
Obtener el total de episodios vistos de una serie.
Obtener el promedio de las calificaciones dadas para una temporada particular.
Obtener el promedio de las calificaciones dadas para una serie.
Determinar si se vio todos los episodios de la serie.
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos */
import java.util.ArrayList;
public class Serie {
	//atributos
	private ArrayList <Temporada> temporadas;
	private String titulo, genero, descripcion, creador;
	
	//constructores
	
	public Serie ( String titulo,String genero, String descripcion, String creador){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void addTemporada(Temporada t){
		if (!this.temporadas.contains(t))
		this.temporadas.add(t);
	}
	
	public int cantEpisodiosVistos(){
		int cant=0;
		for(int i=0; i<this.temporadas.size(); i++) {
			Temporada t = (Temporada)this.temporadas.get(i);
			cant+= t.getCantidadEpisodiosVistos();
		}
		return cant;
	}
	
	public double getPromedioCalificaciones(){
		int cant=0;
		int suma=0;
		for(int i=0; i<this.temporadas.size(); i++) {
			Temporada t = (Temporada)this.temporadas.get(i);
			cant++;
			suma+= t.getPromedioCalificaciones();
		}
		return (double)suma/cant;
	}
	
	public boolean isTodosEpisodiosVistos(){
		for(int i=0; i<this.temporadas.size(); i++) {
			Temporada t = (Temporada)this.temporadas.get(i);
			if(!t.isTodosEpisodiosVistos())
				return false;
		}
		return true;
	}	
	
	public boolean setCalificacion(int t, int e, int c){
		return ((Episodio)(((Temporada)this.temporadas.get(t)).getEpisodio(e))).setCalificacion(c);
	}
}
