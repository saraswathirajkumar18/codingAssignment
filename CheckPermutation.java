package codingAssignment;

public class CheckPermutation {
	
	public static void repeat(String result, String str) {
	    if (str.length() == 0) { 
	    	//if string length is 0 then print result
	      System.out.print(result + " ,");
	      
	    }
	    for (int i = 0; i < str.length(); i++) {
	    	char c=str.charAt(i);
	      //store remaining string excluding the current index character
	      String remstr = str.substring(0, i) + str.substring(i + 1);   
	      //pass remaining string and pass result by adding each char to result
	      repeat(result+c, remstr);
	      
	   
	    }
	  }
	public static void main(String[] args) {
		//create input variable
		String name="CAT";
		//pass the string
		repeat("", name);
	}
}

		  
   