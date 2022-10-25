package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroSintoma extends Filtro {

	private String sintomaBuscado;
	
	public FiltroSintoma(String sintomaBuscado) {
		this.sintomaBuscado = sintomaBuscado;
	}

	@Override
	public boolean cumple(Medicamento medic) {
		return medic.trataSintoma(this.sintomaBuscado);
	}
}
