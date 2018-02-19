package javaprograms;

public class ExpException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This example of Exception Handling ");
		
		
		try {
			
			int i=0;
			int j=10;
			int k;
			k=j*i/i;
			System.out.println("Value of k is"+k);
			
			
			
		}catch(Exception e)
		{
			System.out.println(""+e);
			
		}
		
		
		
		
		
		
		

	}

}
