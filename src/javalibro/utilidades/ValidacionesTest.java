package javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {
		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email("auragaipartek.com"));
		assertFalse(Validaciones.email("auraga@ipartek."));
		assertFalse(Validaciones.email("auraga@"));
		assertFalse(Validaciones.email("auraga@ipartekcom"));
		assertFalse(Validaciones.email("auraga@ipartek.e"));
		assertFalse(Validaciones.email(""));
		
		assertTrue(Validaciones.email("auraga@ipartek.com"));
		
		
	}
	
	public void testDNI() {
		
		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("54t67"));
		assertFalse(Validaciones.email("111111111"));
		assertFalse(Validaciones.email("hhhhhhfff"));
		assertFalse(Validaciones.email("1234412-h"));
		assertFalse(Validaciones.email("12345676-f"));
		assertFalse(Validaciones.email("11111111Y"));
		assertFalse(Validaciones.email("11111111j"));
		
		assertTrue(Validaciones.dni("11111111H"));
		 
		
		
	}

}
