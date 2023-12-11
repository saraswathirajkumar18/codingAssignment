package codingAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//limit number
        int n=10;
        //create and initialize the variable
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=0;i<n;i++)
		{//print n1 value
			System.out.println(n1);
		 //add value of n1 and n2
			sum=n1+n2;
			//copy n2 value to n1
			n1=n2;
			//copy sum value to n2
			n2=sum;
		}
	}

}
