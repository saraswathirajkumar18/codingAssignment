package codingAssignment;
import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Get two string
String str1="Welcome";
String str2="ceelmow";
//comparing length of 2 strings -if same -anagrams
if(str1.length()==str2.length())
{
	System.out.println("anagrams");
	//convert into lowercase
	String newstr=str1.toLowerCase();
	String newstr2=str2.toLowerCase();
    //string into char array
	char[] charArray1 = newstr.toCharArray();
	//System.out.println(charArray1);
    char[] charArray2 = newstr2.toCharArray();

    //sort char array
    Arrays.sort(charArray1);
    
    Arrays.sort(charArray2);

    //if char arrays are same then the string is anagram
    boolean res = Arrays.equals(charArray1, charArray2);

    if(res) { 
      System.out.println(str1 + "," + str2 +" is anagrams");
    }
    else {
      System.out.println(str1 + "," + str2 + "not anagrams");
    }
}
//when 2 string's length is not equal
else
{
	System.out.println("not anagrams");
}
	}

}
