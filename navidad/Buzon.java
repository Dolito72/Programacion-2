package navidad;

import java.util.ArrayList;


public class Buzon extends ElementoAbstracto{
	ArrayList<Ninio>niniosBuenos;
	ArrayList<Carta> cartas;
	private String carbon = "carbon";
	
	public Buzon(){
		this.niniosBuenos = new ArrayList<>();
		this.cartas = new ArrayList<>();
	}
	
	public void addNinioBueno(Ninio n){
		if (!this.niniosBuenos.contains(n)){
			this.niniosBuenos.add(n);
		}
	}
	
	public void addCarta (Carta c){
		if (!this.niniosBuenos.contains(c.getRemitente())){
			c.cambioRegaloPorCarbon(carbon);
		}
		else{
			if (!this.cartas.contains(c))
				this.cartas.add(c);
		}
	}
	
	@Override
	public int cantidadCartasTotal() {
		return this.cartas.size();
	}

	@Override
	public int cantidadCartasPorRegalo(String r) {
		int cant = 0;
		for (Carta c: cartas){
			if(c.tieneRegalo(r)){
				cant++;
			}
		}
		return cant;
	}

	@Override
	public int cantidadNiniosMalos() {
		return this.niniosBuenos.size() - this.cartas.size();
	}

}
