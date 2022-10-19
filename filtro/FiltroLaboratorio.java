package filtro;

import farmacia.Medicamento;

public class FiltroLaboratorio extends Filtro {

	private String labBuscado;
	
	public FiltroLaboratorio(String labBuscado) {
		this.labBuscado = labBuscado;
	}
	
	@Override
	public boolean cumple(Medicamento medic) {
		return medic.getLab().equals(this.labBuscado);
	}

}
