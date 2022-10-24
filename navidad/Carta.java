package navidad;

import java.util.ArrayList;

public class Carta {
	private Ninio remitente;
	private ArrayList<String> regalos;
	
	
	public Carta (Ninio remitente){
		this.remitente = remitente;
		this.regalos = new ArrayList<>();
	}

	public Ninio getRemitente() {
		return remitente;
	}

	public void setRemitente(Ninio remitente) {
		this.remitente = remitente;
	}

	public void addRegalo(String r){
		regalos.add(r);
	}

	public boolean tieneRegalo(String r){
		return this.regalos.contains(r);
	}

	public void cambioRegaloPorCarbon(String carbon) {
		regalos.clear();
		regalos.add(carbon);
	}
	
	
}
