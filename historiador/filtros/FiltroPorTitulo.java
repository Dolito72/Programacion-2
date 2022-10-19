package historiador.filtros;

import historiador.Documento;

public class FiltroPorTitulo extends Filtro{
	private String tituloBuscado;
	
	public FiltroPorTitulo(String tituloBuscado){
		this.tituloBuscado = tituloBuscado;
	}

	@Override
	public boolean cumple(Documento d){
		return  d.getTitulo().equals(this.tituloBuscado);
	}

}
