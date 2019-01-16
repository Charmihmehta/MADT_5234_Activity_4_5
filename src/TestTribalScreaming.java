import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {
/* Requirement
 * 1) One person is amazing -> Peter is amazing
 * 2) Null -> You is amazing
 * 3)Uppercase -> PETER IS AMAZING
 * 
 * stub scream(name)
 */
	@Test
	public void testOnePerson() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream("Peter");
		assertEquals("Peter is amazing",result);
		
	}

}
