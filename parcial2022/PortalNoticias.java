package parcial2022;

import java.util.ArrayList;

public class PortalNoticias {
	private ArrayList<Clasificador> clasificadores;
	
	public PortalNoticias(){
		this.clasificadores = new ArrayList<>();
	}

	public void agregarClasificador (Clasificador c){
		clasificadores.add(c);
	}
	
	public void clasificarNoticia(Noticia n){
		for(int i=0; i<clasificadores.size();i++)
			clasificadores.get(i).clasificarNoticia(n);
	}
}
