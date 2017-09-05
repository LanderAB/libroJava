import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGeneraNumeroAleatorio() {
		
		int numAleatorio = -1;
		
		boolean[] aCheck = new boolean[15]; 
		for (int i = 0; i < 1000; i++) {
			
			numAleatorio = TocaLeer.generaNumeroAleatorio(15);
			aCheck[numAleatorio] = true;
			
		}
		
		//comprobar que todas las posiciones sean true
		for (int i = 0; i < aCheck.length; i++) {
			assertTrue(aCheck[i]);
		}
		
	}

}
