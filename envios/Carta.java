package envios;

public class Carta extends Envio{
	private Persona destinatario;
	private Persona remitente;
	private boolean retiroSucursal;
	private int peso;
	
	public Carta(int numeroTracking, Persona destinatario, Persona remitente, boolean retiroSucursal, int peso){
		super(numeroTracking);
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.retiroSucursal = retiroSucursal;
		this.peso = peso;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public Persona getRemitente() {
		return remitente;
	}

	@Override
	public Persona getDestinatario() {
		return destinatario;
	}

	
	
	
}
