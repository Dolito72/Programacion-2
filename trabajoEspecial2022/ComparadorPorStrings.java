package trabajoEspecial2022;

import java.util.Comparator;

public class ComparadorPorStrings implements Comparator<Object> {

    public int compare(Object a,Object b) {
    	String aux = (String)((Nodo)a).getObjeto();
    	String baux = (String)b;
    	return aux.compareTo(baux);    	
    }
   }

