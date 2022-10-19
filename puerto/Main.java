package puerto;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ColaOrdenada colaCamiones = new ColaOrdenada();
		
		Camion c1 = new Camion("A",2011,6);
		Camion c2 = new Camion("B", 2017, 10);
		Camion c3 = new Camion("C", 2009, 3);
		
		colaCamiones.add(c1);
		colaCamiones.add(c2);
		colaCamiones.add(c3);
		
		while (!colaCamiones.estaVacia()) {
			Camion c = (Camion) colaCamiones.siguiente();
			System.out.println(c);
		}
		
		System.out.println("==============");
		
		ColaOrdenada colaBarcos = new ColaOrdenada();
		
		Barco b1 = new Barco("A","jack sparrow", 6);
		Barco b2 = new Barco("B", "capitan a", 10);
		Barco b3 = new Barco("C", "capitan b", 3);
		
		colaBarcos.add(b1);
		colaBarcos.add(b2);
		colaBarcos.add(b3);
		
		while (!colaBarcos.estaVacia()) {
			Barco b = (Barco) colaBarcos.siguiente();
			System.out.println(b);
		}
		
		
		System.out.println("==================");
		
		ArrayList<Barco> barcos = new ArrayList<>();
		
		barcos.add(b1);
		barcos.add(b2);
		barcos.add(b3);
		
		Collections.sort(barcos);
		Collections.reverse(barcos);
		
		for (int index = 0; index < barcos.size(); index++) {
			System.out.println(barcos.get(index));
		}
	}

}
