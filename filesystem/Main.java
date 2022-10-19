package filesystem;

import java.util.Comparator;

import filesystem.comparadores.ComparadorAnd;
import filesystem.comparadores.ComparadorNot;
import filesystem.comparadores.ComparadorPorNombre;
import filesystem.comparadores.ComparadorPorTamanio;
import filesystem.filtros.Filtro;
import filesystem.filtros.FiltroNombre;
import filesystem.filtros.FiltroNot;

public class Main {

	public static void main(String[] args) {

		Carpeta raiz = new Carpeta("raiz");
		Carpeta carp1 = new Carpeta("carp1");
		
		
		Archivo hola = new Archivo("hola","txt",50);
		Archivo chau = new Archivo("chau","txt",70);

		raiz.addElemento(carp1);
		raiz.addElemento(chau);
		carp1.addElemento(hola);
		
		Filtro filtro = new FiltroNot(new FiltroNombre("a"));
		
		Comparator<Archivo> comparadorT = new ComparadorPorTamanio();
		Comparator<Archivo> comparadorN = new ComparadorPorNombre();
		Comparator<Archivo> comparador = new ComparadorAnd(comparadorT,comparadorN);
		
		//System.out.println(raiz.buscarArchivos(filtro));
		System.out.println(raiz.buscarArchivosOrdenados(filtro, new ComparadorNot(comparadorT)));
		
		//carp1.addElemento(chau);
		
		//System.out.println(raiz);
		/*Carpeta raiz = new Carpeta("raiz");
		
		Carpeta pacman = new Carpeta("pacman");
		Carpeta tudai = new Carpeta("tudai");
		Carpeta fotos = new Carpeta("fotos");
		
		Carpeta primer = new Carpeta("primer anio");
		Carpeta segundo = new Carpeta("segundo anio");
		Carpeta prog2 = new Carpeta("prog2");
		
		raiz.addElemento(pacman);
		raiz.addElemento(tudai);
		raiz.addElemento(fotos);
		
		tudai.addElemento(primer);
		tudai.addElemento(segundo);
		
		primer.addElemento(prog2);
		
		Archivo calendario = new Archivo("calendario","pdf",50);
		
		tudai.addElemento(calendario);
		
		Archivo parcial = new Archivo("parcial","pdf",50);
		Archivo recu = new Archivo("recu","doc",50);
		Archivo prefi = new Archivo("prefi","txt",100);
		
		prog2.addElemento(parcial);
		prog2.addElemento(recu);
		prog2.addElemento(prefi);
		
		int cantTotal = raiz.getCantElementos();
		System.out.println(cantTotal);*/
		
	}

}
