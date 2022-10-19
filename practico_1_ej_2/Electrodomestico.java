package practico_1_ej_2;

public class Electrodomestico {
	//atributos 
			private String nombre;
			private int precioBase;
			private String color;
			private int consumoEnergetico;
			private double peso;
			
			private static final int bajoConsumo = 45;
			private static final int altaGama = 3;
			
			//constructores
			public Electrodomestico (String nombre){
				this(nombre, 100, "gris plata", 10, 2 );
			}
			public Electrodomestico (String nombre, int precioBase) {
				this(nombre, precioBase, "gris plata", 10, 2 );
			}
			public Electrodomestico (String nombre, int precioBase, String color) {
				this(nombre, precioBase, color, 10, 2 );
			}
			public Electrodomestico (String nombre, int precioBase, String color, int consumoEnergetico) {
				this(nombre, precioBase,color, consumoEnergetico, 2 );
			}
			
			public Electrodomestico(String nombre, int precioBase, String color, int consumoEnergetico, double peso ){
				this.nombre = nombre;
				this.precioBase = precioBase;
				this.color = color;
				this.consumoEnergetico = consumoEnergetico;
				this.peso = peso;
			}
			//metodos
			public String getNombre () {
				return nombre;
				
			}
			public void setNombre(String Unnombre) {
				nombre = Unnombre;
			}
			public int getPrecioBase () {
				return precioBase;
			}
			 
			public void setPrecioBase(int Precio) {
				precioBase = Precio;
			}
			
			public String getColor() {
				return color;
			}
			public void setColor(String Uncolor) {
				color = Uncolor;
			}
			
			public int getConsumoEnergetico() {
				return consumoEnergetico;
			}
			
			public void setConsumoEnergetico(int consumo) {
				
				consumoEnergetico = consumo;
			}
			
			public double getPeso() {
				return peso;
			}
			
			public void setPeso (double PesoNuevo) {
				peso= PesoNuevo;
			}
			
			public boolean esBajoConsumo () {
				return (this.getConsumoEnergetico() < bajoConsumo);
			}
			
			public double balance() {
				return (this.getPrecioBase()/(this.getPeso()));
			}
			
			public boolean esAltaGama() {
				return (this.balance() > altaGama);
			}

}
