package sitioWebNoticias.filtros;

import sitioWebNoticias.Noticia;

public class FiltroPorPalabraClave extends Filtro{
	private String palabraClaveBuscada;
	
	public FiltroPorPalabraClave(String palabraClaveBuscada){
		this.palabraClaveBuscada = palabraClaveBuscada;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.tienePalabraClave(palabraClaveBuscada);
	}

}
