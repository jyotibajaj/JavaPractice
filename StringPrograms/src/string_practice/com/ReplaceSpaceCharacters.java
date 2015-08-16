package string_practice.com;

public class ReplaceSpaceCharacters {
	
	
	// replace space with %20
	
	public static  String replaceSpaces(String inputString){
		if(inputString == null || inputString.isEmpty()){
			throw new IllegalArgumentException("invalid input");
		}
		int lengthMinusOne = inputString.length() -1;
		char[] charArray  = inputString.toCharArray();
		int k =0;
		int i=lengthMinusOne;
		//to find out the index of last non-empty character
		for( i=lengthMinusOne; i>=0; i--){
			if(charArray[i]!= ' '){
				k=i;
				break;
				
			}
		}
		// replacing spaces with %20
		for( k=i; k>=0; k--){
			if(charArray[k] != ' '){
				if(lengthMinusOne >0){
				charArray[lengthMinusOne] = charArray[k];
				lengthMinusOne--;
				}	
			}
			else{
				charArray[lengthMinusOne] = '0';
				charArray[lengthMinusOne-1] = '2';
				charArray[lengthMinusOne-2] = '%';
				lengthMinusOne = lengthMinusOne - 3;

				
			}
			
		}
		
		String replacedString = new String(charArray);
		return replacedString;
	}
	

}
