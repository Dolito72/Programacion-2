package trabajoEspecial2022;

import java.util.Comparator;

public class ComparadorPorIntegers implements Comparator<Object> {

    public int compare(Object a,Object b) {
    	Integer aux = (Integer)((Nodo)a).getObjeto();
    	Integer baux = (Integer)b;
    	return aux.compareTo(baux);    	
    }
}
