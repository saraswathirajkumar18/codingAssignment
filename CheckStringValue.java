package codingAssignment;
import java.util.ArrayList;

public class CheckStringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        //create variable or input
		String name="Welcome to PowerRouter.";
		System.out.println(name);
		//convert it into lowercase
		String lowername=name.toLowerCase();
		//split string by space
		String[] subname=lowername.split("\\s");
		
		
		char newname='\0' ;
		String res="";
		ArrayList<String> lens= new ArrayList<String>();
		//to find duplicate characters in splitted string
		for(String val:subname)
		{
			
			res="";
			int i,j;
			//length of string
			int len=val.length();
			
			loop1:
			for(i=0;i<len;i++)
			{
			for(j=i-1;j>=0;j--)
			{
		
			//check current char match with prev char
			if(val.charAt(i)==val.charAt(j))
			{
				//out of both inner and outer loop
			    break loop1;
			   			
			}
			//check current char doesn't match with prev char
			else
			{
				//store char in string

				newname=val.charAt(i);
					
			}
						
			}	
			//no validation need for 1st char in string
			
			if(i==0)
			{
				//store char in string
				newname=val.charAt(i);
			}
			
			//cancat all char
			res+=newname;		
		}
			//add each string into array list
		lens.add(res);	

	}
		
		int maxval=0;
		String lastres="";
		for(String output:lens)
		{//check length of the each substring 
			int newval=output.length();
			//find max length by checking each substring length
			if(maxval<newval)
			{
				maxval=newval;
				lastres=output;			
			}				
		}
		//print max length string -which has no duplicate char
		System.out.println(lastres);		
}
}