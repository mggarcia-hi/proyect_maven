package maven.proyect;

import junit.framework.TestCase;

public class OperacionesTest extends TestCase {

	public void testSuma() {
		Operaciones op= new Operaciones();
		int result= op.suma(3, 6);
		assertEquals(result, 9);
	}
	
	public void testSuma2() {
		Operaciones op= new Operaciones();
		int result= op.suma(3, 6);
		assertEquals(result, 9);
	}

}
