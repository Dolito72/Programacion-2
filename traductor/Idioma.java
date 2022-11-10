package traductor;

import java.util.HashMap;

public class Idioma {
	private String idioma;
	private HashMap<String, String> diccionario;
	public  final static String ERROR = "ERROR";
	
	public Idioma(String idioma){
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}

	public HashMap<String, String> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(HashMap<String, String> diccionario) {
		this.diccionario = diccionario;
	}

	public void addPalabra(String idioma, String ingles){
		diccionario.put(idioma, ingles);
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String palabraIngles(String palabraIdioma){
		if(diccionario.containsKey(palabraIdioma))
			return diccionario.get(palabraIdioma);
		else
			return Idioma.ERROR;
	}
	public String palabraIdioma(String palabraIngles){
		for(String palabraIdioma:diccionario.keySet())
			if(diccionario.get(palabraIdioma).equals(palabraIngles))
				return palabraIdioma;
		return Idioma.ERROR;
	}
	
	public String traducir(Idioma destino, String palabra){
		return destino.palabraIdioma(this.palabraIngles(palabra));
		
	}
}
