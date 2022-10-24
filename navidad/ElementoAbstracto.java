package navidad;

public abstract class ElementoAbstracto{
	
	//4 m�todos  que heredan buz�n y zona
	
	public abstract int cantidadCartasPorRegalo(String r);
	public abstract int cantidadCartasTotal();
	public abstract int cantidadNiniosMalos();
	
	//m�todo concreto template que tiene un m�todo abstracto de la clase
	public double porcentajeCartasPorRegalo (String r){
		return (cantidadCartasPorRegalo(r)/cantidadCartasTotal()*100);
	}
	
}