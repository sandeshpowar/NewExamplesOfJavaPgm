package javaprograms;

import java.util.regex.Pattern;

public class ExpString {
	
	public boolean containNumbersOnly(String source)
	{
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
        pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.

        result = pattern.matcher(source).matches();
        if(result)
        {
            System.out.println("\"" + source + "\""  + " is a number");
        }else
            System.out.println("\"" + source + "\""  + " is a String");
        return result;
    }
	

	
	
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
				ExpString obj = new ExpString();
	            obj.containNumbersOnly("123456.a");
	            obj.containNumbersOnly("123456 ");
	            obj.containNumbersOnly("123456");
	            obj.containNumbersOnly("0123456.0");
	            obj.containNumbersOnly("0123456a.0");
	 }

	

}
