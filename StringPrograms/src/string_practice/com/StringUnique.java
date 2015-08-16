package string_practice.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringUnique {

	/*
	 * functions to check whether given string is unique.
	 */

	/*
	 * time complexity: n square no added data structure is used return true if
	 * string unique else false.
	 */
	public static boolean isUnique(String inputString) {
		// null and empty check.
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j < inputString.length(); j++) {
				if (inputString.charAt(i) == inputString.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * time complexity: n array Buffer is used to store the characters. return
	 * true if string unique else false.
	 */
	public static boolean isUniqueUsingArrayBuffer(String inputString) {
		// null, empty and length check
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		boolean[] arrayBuffer = new boolean[256];
		for (int i = 0; i < inputString.length(); i++) {
			int val = inputString.charAt(i);
			if (arrayBuffer[val]) {
				return false;
			} else {
				arrayBuffer[val] = true;
			}

		}

		return true;

	}

	/*
	 * time complexity: n HashMap is used to store the characters. return true
	 * if string unique else false.
	 */
	public static boolean isUniqueUsingHashMap(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for (int i = 0; i < inputString.length(); i++) {
			Character charData = inputString.charAt(i);
			if (i == 0) {
				map.put(charData, true);
			} else if (map.containsKey(charData)) {
				return false;
			} else {
				map.put(charData, true);
			}
		}

		return true;

	}



	/*
	 * time complexity: n. HashSet is used to store the characters. return true
	 * if string unique else false.
	 */
	public static boolean isUniqueUsingHashSet(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			Character charData = inputString.charAt(i);

			if (set.add(charData) == false) {
				return false;
			} else {
				set.add(charData);
			}
		}

		return true;

	}
	

	/*
	 * time complexity: nlogn. 
	 *  return true if string unique else false.
	 */
	public static boolean isUniqueUsingSorting(String inputString) {
		
		if (inputString == null || inputString.isEmpty()) {
			throw new IllegalArgumentException("invalid input");
		}
		char[] charArray = inputString.toCharArray();
		Arrays.sort(charArray);
		for (int i = 0; i < inputString.length() -1; i++) {
			Character charData = inputString.charAt(i);
			Character charDataNext  = inputString.charAt(i+1);
			if(charData == charDataNext){
				return false;
				
			}

		}

		return true;

	
	}
	
	
	
	

}
