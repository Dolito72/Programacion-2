package farmacia;

import java.util.ArrayList;

public class Paciente {

	private ArrayList<String> sintomas;
	
	public Paciente() {
		this.sintomas = new ArrayList<>();
	}
	
	public void addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}
	
	public boolean leSirve(Medicamento medic) {
		
		for (int index = 0; index < this.sintomas.size(); index++) {
			String sintoma = this.sintomas.get(index);
			if (medic.trataSintoma(sintoma))
				return true;
		}
		
		return false;
	}
}
