package javalibro.pojo;

import java.util.ArrayList;

import javalibro.pojo.interfaces.Imprimible;

/**
 * 
 * Creamos una lista para contener objertos de las Clases Participante y Libro
 * @author Administrador
 *
 */
public class ListaInterfaz {

	public static void main(String[] args) {
		
		ArrayList<Imprimible> arrayImprimible = new ArrayList<Imprimible>();
		
		LibroElectronico le = new LibroElectronico("Años salvajes");		
		LibroPapel lp = new LibroPapel("Papillon");		
		Libro l = new Libro("Cien años de soledad");
		
		Participante p1 = new Participante("Lander", "landerAB");
		
		arrayImprimible.add(l);
		arrayImprimible.add(le);
		arrayImprimible.add(lp);
		arrayImprimible.add(p1);
		
		System.out.println(arrayImprimible.size());
		for(int i = 0; i < arrayImprimible.size(); i++) {
			if(arrayImprimible.get(i) instanceof Libro) {
				System.out.println("Esto es un libro!!");
				System.out.println(arrayImprimible.get(i));
			} else if (arrayImprimible.get(i) instanceof Participante){
				System.out.println("Aqui viene un participante");
				System.out.println(arrayImprimible.get(i));
			} else {
				System.out.println("No conozco esta clase");
			}
			
		}

	}

}
