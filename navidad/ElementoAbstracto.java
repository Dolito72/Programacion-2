package navidad;

public abstract class ElementoAbstracto{
	
	//4 métodos  que heredan buzón y zona
	
	public abstract int cantidadCartasPorRegalo(String r);
	public abstract int cantidadCartasTotal();
	public abstract int cantidadNiniosMalos();
	
	//método concreto template que tiene un método abstracto de la clase
	public double porcentajeCartasPorRegalo (String r){
		return (cantidadCartasPorRegalo(r)/cantidadCartasTotal()*100);
	}
	
}