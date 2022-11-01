package empresaMultinacional;

public class Main {

	public static void main(String[] args) {
		Empleado Juan = new Empleado ( "Juan","Perez", "Java", 1500.50);
		Empleado Maria = new Empleado ( "Maria","Perez", "php", 1200.50);
		Empleado Jose = new Empleado ( "Jose","Perez", "Java", 1000);
		Empleado Pedro = new Empleado ( "Pedro","Perez", "Phyton", 1800);
		
		Grupo g1 = new Grupo ("backend");
		g1.addElemento(Juan);
		g1.addElemento(Jose);
		
		Grupo g2 = new Grupo ("investigacion");
		g2.addElemento(Pedro);
		

		Grupo g3 = new Grupo ("frontend");
		g3.addElemento(Maria);
		
		Grupo sucursalTandil = new Grupo ("Tandil");
		sucursalTandil.addElemento(g1);
		sucursalTandil.addElemento(g2);
		
		Grupo sucursalQuequen = new Grupo ("Quequen");
		sucursalQuequen.addElemento(g3);

		Grupo empresa = new Grupo ("SofTan");
		empresa.addElemento(sucursalTandil);
		empresa.addElemento(sucursalQuequen);
		empresa.addElemento(new Empleado("Ariel","Monteserin", "Java", 1200.50));
		
		System.out.println("La empresa tiene " + empresa.getCantidadEmpleados()+ " empleados.");
		
	}

}
