package historiador.filtros;

import historiador.Documento;

public class FiltroPorPalabraClave extends Filtro {
	private String palabraClaveBuscada;
	
	public FiltroPorPalabraClave(String palabraClaveBuscada){
		this.palabraClaveBuscada = palabraClaveBuscada;
	}
	@Override
	public boolean cumple(Documento d) {
		return d.tienePalabraClave(this.palabraClaveBuscada);
	}

}
