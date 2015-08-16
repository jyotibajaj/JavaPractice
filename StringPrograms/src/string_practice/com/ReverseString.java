package string_practice.com;

public class ReverseString {
	/*
	 * displays function that reverses string
	 */

	// Using for loop

	public static String reverseString(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		// charArray
		char[] charArray = inputString.toCharArray();
		char temp;
		for (int i = 0, j = inputString.length() - 2; i < j; i++, j--) {
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		// Converting back to string
		String reversedString = new String(charArray);
		return reversedString;

	}

	// Using StringBuffer
	public static String reverseStringUsingStringBuilder(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}

		StringBuilder stringBuilder = new StringBuilder(inputString);
		stringBuilder.reverse();

		// Converting back to string
		String reversedString = new String(stringBuilder);
		return reversedString;

	}

}
