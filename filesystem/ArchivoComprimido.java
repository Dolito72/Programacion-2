package filesystem;

public class ArchivoComprimido extends Carpeta {

	private double compresion;
	
	public ArchivoComprimido(String nombre, double compresion) {
		super(nombre);
		this.compresion = compresion;
	}
	
	@Override
	public int getTamanio() {
		return (int) (super.getTamanio() * this.compresion);
	}

}
