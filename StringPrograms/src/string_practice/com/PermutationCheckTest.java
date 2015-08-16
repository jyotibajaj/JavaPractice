package string_practice.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationCheckTest {

	@Test
	public void testIsPermutationPresentAfterSorting() {
		assertTrue(PermutationCheck.isPermutationPresentUsingSorting("abcd",
				"bdca"));
		assertFalse(PermutationCheck.isPermutationPresentUsingSorting("abcd",
				"baca"));
		try {
			PermutationCheck.isPermutationPresentUsingSorting("", "");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
		try {
			PermutationCheck.isPermutationPresentUsingSorting("", "baca");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
		try {
			PermutationCheck.isPermutationPresentUsingSorting("baca", "");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
//		try {
//			PermutationCheck.isPermutationPresentUsingSorting(null, "baca");
//			fail("should go in catch");
//		} catch (Exception e) {
//			assertTrue(e instanceof IllegalArgumentException);
//			assertEquals(
//					new IllegalArgumentException("invalid input").toString(),
//					e.toString());
//		}
//		try {
//			PermutationCheck.isPermutationPresentUsingSorting("baca", null);
//		} catch (Exception e) {
//			assertTrue(e instanceof IllegalArgumentException);
//			assertEquals(
//					new IllegalArgumentException("invalid input").toString(),
//					e.toString());
//		}
//		try {
//			PermutationCheck.isPermutationPresentUsingSorting(null, null);
//		} catch (Exception e) {
//			assertTrue(e instanceof IllegalArgumentException);
//			assertEquals(
//					new IllegalArgumentException("invalid input").toString(),
//					e.toString());
//		}

	}
	
	@Test
	public void testIsPermutationPresentUisngArrays() {
		assertTrue(PermutationCheck.isPermutationPresentUsingArrays("abcd",
				"bdca"));
		assertFalse(PermutationCheck.isPermutationPresentUsingArrays("abcd",
				"baca"));
		try {
			PermutationCheck.isPermutationPresentUsingArrays("", "");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
		try {
			PermutationCheck.isPermutationPresentUsingArrays("", "baca");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
		try {
			PermutationCheck.isPermutationPresentUsingArrays("baca", "");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}
		try {
			PermutationCheck.isPermutationPresentUsingArrays(null, null);
		} catch (Exception e) {
//			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid input").toString(),
					e.toString());
		}

	
	

}
		
}
