package practico_2_ej_1;

public class Episodio {
	private String titulo;
	private String descripcion;
	private int calificacion;
	private boolean visto;
	private static int minCalif = 1;
	private static int maxCalif = 5;

	public Episodio(String titulo, String descripcion){
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.visto = false;
		this.calificacion = -1;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean isVisto(){
		return visto;
	}
	
	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}
	public boolean setCalificacion(int calificacion){
		if ((calificacion>=minCalif) && (calificacion <= maxCalif)){
			this.calificacion = calificacion;
			this.setVisto(true);
			return true;
		}
		else {
			return false;
		}		
	}
}
