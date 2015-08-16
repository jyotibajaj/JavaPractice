package string_practice.com;

import java.util.Arrays;

public class PermutationCheck {
	/*
	 * Questions about Assumptions:Strings not case sensitive "god" equals "Ogd"
	 * ASCII white space is considered so "god" is not equal to "god   "
	 */

	// Check Using Sorting
	public static boolean isPermutationPresentUsingSorting(String inputOne,
			String inputTwo) {

		if (inputOne.isEmpty() || inputTwo.isEmpty() || inputOne == null
				|| inputTwo == null) {

			throw new IllegalArgumentException("invalid input");
		}

		if (inputOne.length() != inputTwo.length()) {
			return false;

		} else {
			// convert to charArray, sort them and compare
			char[] charArrayOne = inputOne.toCharArray();
			char[] charArrayTwo = inputTwo.toCharArray();
			Arrays.sort(charArrayOne);
			Arrays.sort(charArrayTwo);
			String inputStringOne = new String(charArrayOne);
			String inputStringTwo = new String(charArrayTwo);
			return inputStringOne.equalsIgnoreCase(inputStringTwo);
		}

	}

	// check using arrays
	public static boolean isPermutationPresentUsingArrays(String inputOne,
			String inputTwo) {
		if (inputOne.isEmpty() || inputTwo.isEmpty() || inputOne == null
				|| inputTwo == null) {

			throw new IllegalArgumentException("invalid input");
		}

		if (inputOne.length() != inputTwo.length()) {
			return false;

		} else {
			// Assumption ASCII and case sensitive
			int[] character = new int[128];
			for (int i = 0; i < inputOne.length(); i++) {
				int asciiValue = inputOne.charAt(i);
				// incrementing by one
				++character[asciiValue];
			}
			for (int i = 0; i < inputTwo.length(); i++) {
				int asciiValue = inputTwo.charAt(i);
				// decreasing by one
				if (--character[asciiValue] < 0) {
					return false;

				}

			}

			return true;

		}

	}
}
