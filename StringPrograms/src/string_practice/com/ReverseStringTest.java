package string_practice.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseString() {
		assertEquals("dcba$", ReverseString.reverseString("abcd$"));
		assertNotEquals("abcd$", ReverseString.reverseString("abcd$"));
		assertNotEquals("abcd$", ReverseString.reverseString("abcd$"));

		//for empty string input
		try {
			ReverseString.reverseString("");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(new IllegalArgumentException("invalid input").toString(),
					e.toString());

		}
		// for null input
		try {
			ReverseString.reverseString(null);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(new IllegalArgumentException("invalid input").toString(),
					e.toString());

		}

	}
	
	
	@Test
	public void testReverseStringUsingStringBuffer() {
		assertEquals("dcba$", ReverseString.reverseString("abcd$"));
		assertNotEquals("abcd$", ReverseString.reverseString("abcd$"));
		assertNotEquals("abcd$", ReverseString.reverseString("abcd$"));

		//for empty string input
		try {
			ReverseString.reverseString("");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(new IllegalArgumentException("invalid input").toString(),
					e.toString());

		}
		// for null input
		try {
			ReverseString.reverseString(null);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(new IllegalArgumentException("invalid input").toString(),
					e.toString());

		}

	}

}
