package javaprograms;

public class ExpString1 {

	public static void main(String[] args) {
		
/*		String a="jklmn5pjro2ops";

	    int sum = 0;

	    String num = "";

	    for(int i = 0; i < a.length(); i++)
	    {
	        if(Character.isDigit(a.charAt(i)))
	        {
	            num = num + a.charAt(i);
	        } 
	        else 
	        {
	            if(!num.equals(""))
	            {
	                sum = sum + Integer.parseInt(num);
	                num = "";
	            }
	        }
	    }

	    System.out.println("\n\t\t "+sum);*/
	    
	    
	    
	    
	    String a1="jklmn56878pjro2145ops";

	    int sum1 = 0;

	    String num1 = "";

	    for(int i = 0; i < a1.length(); i++) //addition of number which is present in string 
	    {
	        if(Character.isDigit(a1.charAt(i))) 
	        {
	        	num1 = num1 + a1.charAt(i);
	        } 
	        else
	        {
	            if(!num1.equals("")) 
	            {
	                sum1 = sum1 + Integer.parseInt(num1);
	                num1 = "";
	            }
	        }
	    }

	    System.out.println("\n\t\t"+sum1);

	    
	    

	    

	    String input = "jklmn56878pjro2145ops";

	    int sum6 = 0;

	    char[] c = input.toCharArray();                // Addition of Each Digit Which is present in Given String 

	    for(int i = 0;i<=c.length-1;i++)
	    {
	      if(Character.isDigit(c[i]))
	      {
	          Character c1 = c[i];
	          String s1 = c1.toString();
	          int i1 = Integer.parseInt(s1);

	          sum6 = sum6+i1;
	      }
	    }
	    System.out.println("\n\t\t"+sum6);
	    
	    }


	}

