package sistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zona extends ElementoElectoral{
	ArrayList<ElementoElectoral> elementos;
	
	public Zona(){
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento (ElementoElectoral e){
		this.elementos.add(e);
	}
	@Override
	public int cantidadVotos() {
		int cant = 0;
		for (ElementoElectoral e: elementos)
			cant += e.cantidadVotos();
		return cant;
	}

	@Override
	public double porcentajeVotosPorCandidato(Candidato c) {
		int porcentaje = 0;
		for (ElementoElectoral e:elementos)
			porcentaje += e.porcentajeVotosPorCandidato(c) * e.cantidadVotos()/this.cantidadVotos();
		return porcentaje;
	}

	@Override
	public double porcentajeVotosEnBlanco(Candidato c) {
		int cant = 0;
		for (ElementoElectoral e: elementos)
			if (c == null)
				cant++;
		return cant/cantidadVotos()*100;
	}

	@Override
	public double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin) {
		int cant = 0;
		for (ElementoElectoral e:elementos)
			cant += e.porcentajeVotosPorHora(inicio, fin);
		return cant/cantidadVotos()*100;
	}

}
