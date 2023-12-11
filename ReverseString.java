package codingAssignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store input
		String word="welcome";
		System.out.println(word);
		//create variable for output
		String reversed="";
		//start printing from last character upto character in 0th index 
		for(int i=word.length()-1;i>=0;i--)
		{
			//concat each char to output variable
			reversed+=word.charAt(i);
			
		}
		//print result
		System.out.println(reversed);
	}

}

