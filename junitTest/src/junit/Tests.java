package junit;

import static org.junit.Assert.*;

public class Tests {
	
	public void Myjunit() {
		
		assertTrue(ReturnTrue() != false);
		
		assertEquals(AddTwoNumbers(6,9), 15);
	}

}
