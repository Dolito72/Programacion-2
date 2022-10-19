package practico_1_ej_3;

public class AdminFiguras {
	public void imprimir(Figura cc) {
		System.out.println(cc.getNombre() + "- " + cc.getArea());
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura r1 = new Figura("XXX") ;
		Figura r2 = r1;
		r1.getNombre();
		
		
		
		AdminFiguras admin = new AdminFiguras();
		
		admin.imprimir(r2);
		admin.imprimir(r1);
		admin.imprimir(new Circulo(10));
		System.out.println(r1.getValoresFinales());
		System.out.println(r1.getValoresArreglo()[0]);
		System.out.println(r1.getValoresArreglo()[1]);
		System.out.println(r1.equals(r2));
	}
}


