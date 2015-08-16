package string_practice.com;

public class StringBuffer {
	

	public static String concatUsingString(String inputString){
	for(int i=0; i<5; i++){
	/*in each iteration new String creates and 
	hence uses new memory, consumes more time*/
	inputString = inputString + i;
	}
	 System.out.println(inputString.toString());

	return inputString;

}

	//StringBuilder for concatenation
	public static String concatUsingStringBuilder(String inputString){
	StringBuilder builderObject = new
	 StringBuilder(inputString);
	/*appends in same memory location, faster 
	than string concatenation*/
	for(int i=0; i<5; i++){
	  builderObject.append(i);
	}
	 System.out.println(builderObject.toString());

	return builderObject.toString();
}

public static void main(String[] args) {
	 long startTime = System.currentTimeMillis();  
	 concatUsingString("ab");
     System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
     startTime = System.currentTimeMillis();  
     concatUsingStringBuilder("bcda");
     System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
 }  
	
	
}

	


