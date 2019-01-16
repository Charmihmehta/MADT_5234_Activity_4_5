import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {
/* Requirement
 * 1) One person is amazing -> Peter is amazing
 * 2) Null -> You are amazing
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
	@Test
	public void testNullPerson() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream(null);
		assertEquals("You are amazing",result);
		
	}
	@Test
	public void testPersonShouting() {
		TribalScreaming t = new TribalScreaming();
		String result = t.scream("PETER");
		assertEquals("PETER IS AMAZING",result);
		
	}
	
	@Test
	public void testTwoPersonShouting() {
		TribalScreaming t = new TribalScreaming();
		String[] expected_op = new String[] {"Peter","Jigesha"};
		String result = t.scream_name(expected_op);
		assertEquals("Peter and Jigesha are amazing",result);
		
	}
	
}
