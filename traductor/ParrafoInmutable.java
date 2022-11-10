package traductor;

public class ParrafoInmutable extends Parrafo {

	public ParrafoInmutable(Idioma idioma) {
		super(idioma);
		
	}

	@Override
	public Elemento traducir(Idioma destino) {
		ParrafoInmutable copia = new ParrafoInmutable (this.getIdioma());
		for (String p: palabras)
			copia.agregarPalabra(p);
		return copia;
		
	}
}
