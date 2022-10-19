package envios;

import java.util.ArrayList;

public class Combo extends Envio{
	ArrayList<Envio>envios;
	
	public Combo(int numeroTracking) {
		super(numeroTracking);
		this.envios = new ArrayList<>();
	}

	public void addEnvio(Envio e){
		if (this.envios.isEmpty() || e.getCiudadDestino().equals(this.getCiudadDestino()));
			this.envios.add(e);
	}
	
	@Override
	public void setNumeroTracking(int numeroTracking) {
		// me traigo lo que hacia el método original
		super.setNumeroTracking(numeroTracking);
			for (Envio e:envios){
				e.setNumeroTracking(numeroTracking);
			}
	}

	@Override
	public int getPeso() {
		int total = 0;
		for(Envio e:envios){
			total+= e.getPeso();
		}
		return total;
	}

	@Override
	public Persona getRemitente() {
		return this.envios.get(0).getRemitente();
	}

	@Override
	public Persona getDestinatario() {
		return this.envios.get(0).getDestinatario();
	}

}
