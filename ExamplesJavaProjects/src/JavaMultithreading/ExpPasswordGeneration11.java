package JavaMultithreading;

import java.io.DataInputStream;
import java.io.IOException;

public class ExpPasswordGeneration11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream in=new DataInputStream(System.in);
		sample s1=new sample();
		System.out.println("Enter Passowrd Size");
		
		
		

	}

}
enum password{
	low,medium,high;
}

class sample{
	static int ThreadLocalRandom() {
		/*Object min;
		Object max;*/
		int range=ThreadLocalRandom();
		
				if(range%2==0){
					
						password1() ;
						
					}else {
						password2();
					}
				return range;
				
		}

	private static void password1() {
		int range=ThreadLocalRandom();
		for(int i=0;i<=range;i++) {
			System.out.println(i);
			
		}
		
	}
	private static String password2() {
		return null;
		
	}
}
		
	

