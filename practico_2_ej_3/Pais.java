package practico_2_ej_3;
import java.util.ArrayList;
/*y las provincias que tienen mas de la mitad de las ciudades en condición
de déficit.*/
public class Pais {
	ArrayList<Provincia>provincias;
	
	public Pais() {
		this.provincias = new ArrayList<Provincia>();
	}
	
	public void agregarProvincia(Provincia p1){
		if (!provincias.contains(p1)){
			provincias.add(p1);
		}
	}
	
	public int cantidadProvincias(){
		return provincias.size();
	}
	
	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	public String CiudadesConDeficit(){
		String ciudades = "";
		for(int i=0;i<provincias.size();i++){
			if (provincias.get(i).tieneMasDeLaMitadEnDeficit()){
			ciudades+= "En " +provincias.get(i).getNombre()+ "las ciudades que tienen déficit son:  " + provincias.get(i).listadoCiudadesQueGastanMas();
			}
		}
		return ciudades;
	}
}