package JavaStringDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpStringReverse2Demo {

	public static void main(String[] args) {
/*		
		Pseudo Code for Reverse String Method 2:

			1.  In the second method , we will use the built in reverse() method of the StringBuilder class ,.
			Note :  String class does not have reverse() method . So we need to convert the input string to StringBuilder , which is achieved by using the append method of the StringBuilder.

			2.  After that print out the characters of the reversed string  by scanning from the first till the last index.
*/
		
		
		
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String input="";
		
		System.out.println("Enter input String");
		try {
			input=in.readLine();
//			String input="AllISWell";
			StringBuilder st=new StringBuilder();
			st.append(input);
			st=st.reverse();
			for(int i=0;i<st.length();i++) {
				System.out.print(st.charAt(i));
			}
				
		} catch (IOException e) {
		
			e.printStackTrace();
		}	

	}

}
