/**
 * Una farmacia desea organizar sus medicamentos. De cada uno de ellos guarda:
 * el nombre, laboratorio, precio, un conjunto de síntomas que trata.
 * 
 *   La farmacia desea poder buscar todos los Medicamentos del laboratorio Bayer
 *   Buscar medicamentos de otro laboratorio
 *   Buscar medicamentos por nombre
 *   Buscar medicamento por precio
 *   Combinaciones lógicas de los anteriores
 */

package farmacia;

import java.util.ArrayList;

import farmacia.filtros.*;

public class Farmacia {
	private ArrayList<Medicamento> medicamentos;
	
	public Farmacia() {
		medicamentos = new ArrayList<>();
	}
	
	public void addMedicamento(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}
	
	public ArrayList<Medicamento> medicamentosFiltrados(Filtro f){
		ArrayList <Medicamento> resultado = new ArrayList<>();
		for (Medicamento m: medicamentos)
			if (f.cumple(m))
				resultado.add(m);
		return resultado;
	}
	
}
