package javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		
		
		HashSet<String> listaNombres = new HashSet<String>();
		
		listaNombres.add("Manolo");
		listaNombres.add("Manola");
		listaNombres.add("Manolito");
		listaNombres.add("Manolita");
		listaNombres.add("Manuel");
		
		//Iterator es más óptimo para recorrer colecciones que un for. 
		Iterator<String> it = listaNombres.iterator();
		
		String nombre = "";
		
		while(it.hasNext()) {
			nombre = it.next();
			System.out.println(nombre);
		}
		
		

	}

}
