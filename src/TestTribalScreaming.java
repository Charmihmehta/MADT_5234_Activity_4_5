import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {
/* Requirement
 * 1) One person is amazing -> Peter is amazing
 * 2) Null -> You are amazing
 * 3)Uppercase -> PETER IS AMAZING
 * 4) accept 2 names -> Peter and Jigesha are amazing
 * 5) More than 2 person -> Peter, Jigesha, and Marcos are amazing
 * 6) Jumble more names -> Peter, Marcos, and Albert are amazing. JIGESHA ALSO!

 * 
 * stub scream(name)
 */
	
	// First factor
	@Test
	public void testOnePerson() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream("Peter");
		assertEquals("Peter is amazing",result);
		
	}
	// Second Factor
	@Test
	public void testNullPerson() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream(null);
		assertEquals("You are amazing",result);
		
	}
	
	// Third Factor
	@Test
	public void testPersonShouting() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream("PETER");
		assertEquals("PETER IS AMAZING",result);
		
	}
	// Fourth factor
	@Test
	public void testTwoPersonShouting() {
		TribalScreaming t = new TribalScreaming();
		String[] expected_op = new String[] {"Peter","Jigesha"};
		String result = t.scream_name(expected_op);
		assertEquals("Peter and Jigesha are amazing",result);
		
	}
	// Fifth factor
	@Test
	public void testTwoOrMorePersonShouting() {
		TribalScreaming t = new TribalScreaming();
		String[] expected_op = new String[] {"Peter","Jigesha","Marcos"};
		String result = t.scream_name(expected_op);
		assertEquals("Peter, Jigesha and Marcos are amazing.",result);
		
	}
	// Sixth factor
		@Test
		public void testMorePersonShouting() {
			TribalScreaming t = new TribalScreaming();
			String[] expected_op = new String[] {"Peter","Marcos","Albert","JIGESHA"};
			String result = t.scream_name(expected_op);
			assertEquals("Peter, Marcos and Albert are amazing. JIGESHA ALSO!",result);
			
		}
	
}
