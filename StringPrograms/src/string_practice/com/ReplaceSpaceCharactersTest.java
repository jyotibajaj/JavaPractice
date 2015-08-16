package string_practice.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceSpaceCharactersTest {

	@Test
	public void test() {
		assertEquals("a%20b%20df", ReplaceSpaceCharacters.replaceSpaces("a b df    "));
		assertNotEquals("abcd%", ReplaceSpaceCharacters.replaceSpaces("a bcd  "));

			//for empty string input
			try {
				ReplaceSpaceCharacters.replaceSpaces("");
			} catch (Exception e) {
				assertTrue(e instanceof IllegalArgumentException);
				assertEquals(new IllegalArgumentException("invalid input").toString(),
						e.toString());

			}
			// for null input
			try {
				ReplaceSpaceCharacters.replaceSpaces(null);
			} catch (Exception e) {
				assertTrue(e instanceof IllegalArgumentException);
				assertEquals(new IllegalArgumentException("invalid input").toString(),
						e.toString());

			}

		}
	}


