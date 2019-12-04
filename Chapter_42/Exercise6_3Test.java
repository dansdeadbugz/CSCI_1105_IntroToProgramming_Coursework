package exercise6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise6_3Test {

	@Test
	public void testIsPalindrome() {
		assertTrue(Exercise6_3.isPalindrome(12321));
		assertFalse(Exercise6_3.isPalindrome(321));
	}
	@Test
	public void testReverse() {
		assertEquals(Exercise6_3.reverse(123), 321);
		assertEquals(Exercise6_3.reverse(12321), 12321);
	}
	
}
