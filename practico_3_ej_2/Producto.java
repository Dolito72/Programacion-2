package practico_3_ej_2;


public class Producto {
	private String nombre;
	private int peso;
	private double costoFabricacion;
	private double precioVenta;
	private String tipoMadera;
	private String color;
	private double porcentajeVenta;
	
	public Producto(String nombre, int peso, double costoFabricacion, double precioVenta, String tipoMadera, String color, double porcentajeVenta){
		this.nombre = nombre;
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.precioVenta = precioVenta;
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.porcentajeVenta = porcentajeVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

	public double getPrecioVenta() {
		return (this.getCostoFabricacion() + this.getCostoFabricacion()*this.porcentajeVenta/100);
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPorcentajeVenta() {
		return porcentajeVenta;
	}

	public void setPorcentajeVenta(double porcentajeVenta) {
		this.porcentajeVenta = porcentajeVenta;
	}

	@Override
	public boolean equals(Object obj) {
		Producto otro = (Producto)obj;
		return this.getNombre().equals(otro);
	}
	
	
}
