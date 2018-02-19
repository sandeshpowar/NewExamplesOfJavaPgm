package javaprograms;

public class ExpExceptionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]= {10,20,30,40};
		try {
			
				for(int j=0;j<=5;j++) {
					System.out.println("Array values "+i[j]);
					
				}
		}catch(Exception e) {
			
			System.out.println("Exception ="+e);
		}
		
		
	}

}
