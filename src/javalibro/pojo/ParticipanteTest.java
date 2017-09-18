package javalibro.pojo;
import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testEquals() {
		
		Participante p1 = new Participante();
		Participante p2 = new Participante();
		
		p1.setNombre("nombre");
		p2.setNombre("nombre");
		
		assertEquals(p1, p2);
	}

	public void testConstructoVacio() {
		Participante p = new Participante();

		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
		assertEquals("https://github.com/", p.getLinkGitHub());
	}

	public void testConstructor() {

		Participante p1 = new Participante("ander", "anderuraga");
		p1.setEmail("auraga@ipartek.com");

		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());
	}
}
