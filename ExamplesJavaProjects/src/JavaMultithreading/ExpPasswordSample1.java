package JavaMultithreading;

import java.util.Random;
import java.util.Scanner;

public final class ExpPasswordSample1 {

	@SuppressWarnings("resource")
	public static final void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password Length");
		int range=sc.nextInt();
		Random r1=new Random();
			if((range%2)==0) 
			{
					for(int i=0;i<range;i++) 
					{
					int num=r1.nextInt(100);
					System.out.print(num);
					}
		}else 
		{ 
			final String alphabet = "bdjfsdhbdjhfbabmAB!@#$%^&*CDE";
			final String symbols="!@#$%^&*";
		    final int N = alphabet.length();
		    final int n1 = symbols.length();

		    Random r = new Random();
		    Random r2 = new Random();
		    

		    for (int i = 0; i < range; i++) {
		        System.out.print(alphabet.charAt(r.nextInt(N))) ;
		       
		    }
		//System.out.println("Else PArt Executed");	
		}
	}
}
