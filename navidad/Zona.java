package navidad;

import java.util.ArrayList;

public class Zona extends ElementoAbstracto{
	private ArrayList<ElementoAbstracto> elementos;
	
	public Zona(){
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento (ElementoAbstracto e){
		this.elementos.add(e);
	}

	@Override
	public int cantidadCartasPorRegalo(String r) {
		int cant = 0;
		for(ElementoAbstracto e:elementos){
			cant += e.cantidadCartasPorRegalo(r);
		}
		return cant;
	}

	@Override
	public int cantidadCartasTotal() {
		int cant = 0;
		for(ElementoAbstracto e: elementos){
			cant += e.cantidadCartasTotal();
		}
		return cant;
	}

	@Override
	public int cantidadNiniosMalos() {
		int cant = 0;
		for (ElementoAbstracto e: elementos)
			cant += e.cantidadNiniosMalos();
		return cant;
	}

}
