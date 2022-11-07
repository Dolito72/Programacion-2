package parcial2022;

import java.util.ArrayList;

import parcial2022.filtros.Filtro;

public class Clasificador {
	private ArrayList<String> palabrasClaves;
	private Filtro condicion;
	
	public Clasificador(Filtro condicion){
		this.condicion = condicion;
		this.palabrasClaves = new ArrayList<String>();
	}

	public void clasificarNoticia (Noticia n){
		if(condicion.cumple(n))
			for(int i=0;i<palabrasClaves.size();i++)
				n.addPalabraClave(palabrasClaves.get(i));
	}
}
