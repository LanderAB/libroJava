package javalibro.pojo;

import javalibro.pojo.interfaces.Vendible;
import junit.framework.TestCase;

public class LibrosTest extends TestCase {
	
	public void testPrecio() {
		
		Libro l = new Libro("Cien años de soledad");
		l.setNumPaginas(307);
		assertEquals(61.4f, l.getPrecio());
		
		LibroElectronico le = new LibroElectronico("Libro electronico");
		le.setNumPaginas(569);
		assertEquals(108.8f, le.getPrecio());
		
		LibroPapel lp = new LibroPapel("Libro de papell");
		lp.setNumPaginas(874);
		
		lp.setTapaBlanda(false);
		assertEquals(176.3f, lp.getPrecio());
		
		lp.setTapaBlanda(true);
		assertEquals(174.8f, lp.getPrecio());
		
		le.setNumPaginas(2);
		assertEquals(0.4f, le.getPrecio());

		
		Libro lIncorrecto= new Libro("precio negativo");
		lIncorrecto.setNumPaginas(-6);
		assertEquals(Vendible.PRECIO_MINIMO, lIncorrecto.getPrecio());
	}

}
