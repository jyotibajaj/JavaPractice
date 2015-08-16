package string_practice.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringUnique {

	// test using nested loop
	@Test
	public void testIsStringUniqueUsingNestedLoop() {
		assertTrue(StringUnique.isUnique("abcd"));
		assertFalse(StringUnique.isUnique("abcc"));
		// test for empty string
		try {
			StringUnique.isUnique("");

			fail("Should throw an exception if given string is empty string");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

		// test for null string

		try {

			StringUnique.isUnique(null);

			fail("Should throw an exception if given string is null");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
	}

	// test for uniqueness using array
	@Test
	public void testIsStringUniqueUsingArrayBuffer() {
		assertTrue(StringUnique.isUniqueUsingArrayBuffer("abcd"));
		assertFalse(StringUnique.isUniqueUsingArrayBuffer("abcc"));
		// test for empty string
		try {
			StringUnique.isUniqueUsingArrayBuffer("");

			fail("Should throw an exception if given string is empty string");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

		// test for null string

		try {

			StringUnique.isUniqueUsingArrayBuffer(null);

			fail("Should throw an exception if given string is null");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

	}

	// test for uniqueness using HashMap

	@Test
	public void testIsStringUniqueUsingHashMap() {
		assertTrue(StringUnique.isUniqueUsingHashMap("abcd"));
		assertFalse(StringUnique.isUniqueUsingHashMap("abcc"));
		// test for empty string
		try {
			StringUnique.isUniqueUsingHashMap("");

			fail("Should throw an exception if given string is empty string");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

		// test for null string

		try {

			StringUnique.isUniqueUsingHashMap(null);

			fail("Should throw an exception if given string is null");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

	}

	// test for uniqueness using HashSet

	@Test
	public void testIsStringUniqueUsingHashSet() {
		assertTrue(StringUnique.isUniqueUsingHashSet("abcd"));
		assertFalse(StringUnique.isUniqueUsingHashSet("abcc"));
		// test for empty string
		try {
			StringUnique.isUniqueUsingHashSet("");

			fail("Should throw an exception if given string is empty string");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

		// test for null string

		try {

			StringUnique.isUniqueUsingHashSet(null);

			fail("Should throw an exception if given string is null");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

	}

	// test after sorting the input
	@Test
	public void testIsStringUniqueUsingSorting() {
		assertTrue(StringUnique.isUniqueUsingSorting("abcd"));
		assertFalse(StringUnique.isUniqueUsingSorting("abcc"));
		assertFalse(StringUnique.isUniqueUsingSorting("9909"));

		// test for empty string
		try {
			StringUnique.isUniqueUsingSorting("");

			fail("Should throw an exception if given string is empty string");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

		// test for null string

		try {

			StringUnique.isUniqueUsingSorting(null);

			fail("Should throw an exception if given string is null");

		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
	}

}
