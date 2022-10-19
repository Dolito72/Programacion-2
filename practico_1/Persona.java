package practico_1;
import java.time.LocalDate;
import java.time.Period;

	public class Persona {
		//atributos
		private String nombre,apellido;
		private int edad;
		private LocalDate fnac;
		private long dni;
		private String sexo;
		private double altura,peso;
	
	//constantes
	private static final double minImc = 18.5;
	private static final double maxImc = 25;
	
	//constructores
	public Persona(long dni) {
	  this(dni,"N","N");
	}
	public Persona(long dni, String nombre, String apellido) {
       this(dni,nombre,apellido, "femenino");
     
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo) {
		this(dni,nombre,apellido,sexo, LocalDate.of(2000, 1, 1));
		
	}
	
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac) {
		this(dni,nombre,apellido,sexo,fnac,1);
		
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac, double peso) {
		this(dni,nombre,apellido,sexo,fnac,peso,1);
		
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac, double peso, double altura) {
	    setDni(dni);	
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnac = fnac;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	//métodos
	
	public long getDni() {
		return dni;
	}
	
	private  void setDni(long dni) {
		if (dni>0) {
			this.dni=dni;
		}else {
			dni = 0;
		}
	}
	
	
	public String getInformacion() {
		return nombre +"-"+ apellido+"-"+dni +"-"+ sexo+ "-"+ altura +"-"+ peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		
			this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(LocalDate fechaNac) {
		if ((fechaNac!=null)&& (!fechaNac.isEqual(LocalDate.of(2000, 01, 01)))){
			LocalDate hoy = LocalDate.now();
			Period periodo = Period.between (fechaNac, hoy);
			this.edad = periodo.getYears();
		}
		else {
			this.edad = 0;
		}
	}
	public boolean estacumpliendoaños(LocalDate fechaNac){
		Period diferencia = Period.between(fechaNac, LocalDate.now());
		if ((diferencia.getDays()== 0) && (diferencia.getMonths()== 0)) {
		return true;
		}
		else {
			return false;
		}
	}
	public LocalDate getFnac() {
		return fnac;
	}
	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//método para sacar su imc
	public double indiceMasaCorporal() {
		return (this.getPeso()/(this.getAltura()*this.getAltura()));
	}
	
	//método para saber si esta en forma
	public boolean estaEnForma() {
		double imc = this.indiceMasaCorporal();
		return ((imc>minImc)&&(imc<maxImc));
				
	}

	
}