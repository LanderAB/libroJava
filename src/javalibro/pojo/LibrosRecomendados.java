package javalibro.pojo;

import java.util.ArrayList;

import javalibro.pojo.interfaces.Imprimible;

public class LibrosRecomendados {

	public static void main(String[] args) {
		
		LibroElectronico le = new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setTamanyo(27);
		le.setNumPaginas(523);
		
		LibroPapel lp = new LibroPapel("Papillon");
		lp.setAutor("Henri Charriere");
		lp.setNumPaginas(789);
		lp.setTapaBlanda(false);

		Libro l = new Libro("Cien años de soledad");
		l.setAutor("Gabriel Garcia Marquez");
		l.setNumPaginas(307);
		
		
		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		
		System.out.println(".......OTRO EJERCICIO...........");
		
		
	}

}
