package envios;

public abstract class Envio{
	private int numeroTracking;
	
	public Envio (int numeroTracking){
		this.numeroTracking = numeroTracking;
	}
	
	public int getNumeroTracking(){
		return numeroTracking;
	}

	public void setNumeroTracking(int numeroTracking) {
		this.numeroTracking = numeroTracking;
	}
	
	public abstract int getPeso();
	
	public abstract Persona getRemitente();
	
	public abstract Persona getDestinatario();
	

	
	// M�todo template - Metodo concreto que invoca un m�todo abstracto de la propia clase
		public String getCiudadDestino() {
			Persona destinatario = this.getDestinatario();
			return destinatario.getCiudad();
		}
	
}