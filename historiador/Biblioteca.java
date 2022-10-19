package historiador;

import java.util.ArrayList;
import historiador.filtros.Filtro;

public class Biblioteca {
	private ArrayList<Documento>documentos;
	
	public Biblioteca(){
		this.documentos = new ArrayList<>();
	}
	
	public void addDocumento(Documento d){
		this.documentos.add(d);
	}
	
	public ArrayList<Documento>ListadoDocumentos(Filtro f){
		ArrayList<Documento> resultado = new ArrayList<>();
		for (Documento d: documentos){
			if (f.cumple(d))
				resultado.add(d);
		}
		return resultado;
	}
}
