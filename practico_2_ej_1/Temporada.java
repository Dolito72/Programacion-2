package practico_2_ej_1;
import java.util.ArrayList;
public class Temporada {
	private int numTemporada;
	private ArrayList <Episodio> episodios;
	
	public Temporada (int numTemporada){
		this.numTemporada = numTemporada;
		this.episodios  = new ArrayList<>();
	}
	
	public int getNumTemporada(){
		return numTemporada;
	}
	
	public void addEpisodio(Episodio e){
		if (!this.episodios.contains(e)){
			this.episodios.add(e);
		}
	}
		
	public int getCantidadEpisodios(){
		return this.episodios.size();
	}

	public int getCantidadEpisodiosVistos(){
		int contador = 0;
		for (int i=0; i<this.episodios.size(); i++){
			Episodio ei = (Episodio)this.episodios.get(i);
			if (ei.isVisto()){
				contador++;
			}
		}
		return contador;
	}
	
	public double getPromedioCalificaciones(){
		double suma = 0;
		int contador = 0;
		for (int i=0; i< this.episodios.size(); i++){
			Episodio ei = (Episodio)this.episodios.get(i);
			if (ei.isVisto() && ei.getCalificacion()>0)
				contador++;
				suma+=ei.getCalificacion();
		}	
		return (double)suma/contador;
	}
	
	public boolean isTodosEpisodiosVistos(){
		return (this.episodios.size()==this.getCantidadEpisodiosVistos());		
	}
	 
	public Episodio getEpisodio(int i) {
		return episodios.get(i);
	}
}