package JavaStringDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExpStringReverse1Demo {

	public static void main(String[] args) {
		/*	
		Pseudo Code for Reverse String Method 1:

			1. The user will input the string to be reversed.
			2. First we will convert String to character array by using the built in java String class method toCharArray().

			3. Then , we will scan the string from end  to start,  and print the character one by one.
       */
		String input="";
		System.out.println("Enter the input String");
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			input=br.readLine();
			char[] c1=input.toCharArray();
			for(int i=c1.length-1;i>=0;i--) {
				System.out.print(c1[i]);
				
			}
			//System.out.println(c1);
			/*for(int i=c1.length-1;i>=0;i--)
			{
				System.out.print(c1[i]) ;
			}*/
			
		}catch(Exception e)
		{
			System.out.println("Error---"+e);
		}
	}

}
