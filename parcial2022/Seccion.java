package parcial2022;

import java.util.ArrayList;

import parcial2022.filtros.Filtro;

public class Seccion extends Elemento {
	private ArrayList<Elemento> elementos;
	private String defecto;
	private int posicion;
	
	public Seccion(){
		this.elementos = new ArrayList<>();
		this.defecto = defecto;
		this.posicion = posicion;
	}

	public String getDefecto() {
		return defecto;
	}

	public void setDefecto(String defecto) {
		this.defecto = defecto;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public void agregarElemento (Elemento e){
		this.elementos.add(e);
	}
	@Override
	public String getCategoria() {
		 if(posicion<= elementos.size())
			 return elementos.get(posicion).getCategoria();
		 else
			 return defecto;
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> resultado = new ArrayList<String>();
			for (Elemento e:elementos){
				ArrayList<String> aux = e.getPalabrasClaves();
				for(String s:aux)
					if(!resultado.contains(s))
					resultado.add(s);
			}
		return resultado;
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro f) {
		ArrayList<Noticia> resultado = new ArrayList<Noticia>();
		for (Elemento e:elementos){
			ArrayList<Noticia> resHija = e.buscarNoticias(f);
				resultado.addAll(resHija);
		}
		return resultado;
	}

}
