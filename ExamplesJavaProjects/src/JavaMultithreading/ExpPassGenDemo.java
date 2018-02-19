package JavaMultithreading;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

public class ExpPassGenDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		 passWordgen p1=new passWordgen();
		DataInputStream in=new DataInputStream(System.in); 
		
		 System.out.println("Enter te length of Password "); 
		 int size=Integer.parseInt(in.readLine());
		  passWordgen.generatePassword(size);
	}

}
enum pass{
	low ,high,medium, random;

	public char[] nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
class passWordgen{
	
	private static final String low = null;

	static String generatePassword(int passwordLength) {
	    String password = "";
	    for (int i = 0; i < passwordLength; i++) {
	      password = password + " ";
	    }
	    Random random = new Random();
	    for (int i = 0; i < password.length(); i++) {
	      if (i == 0) {
	        password = String.valueOf(pass.low.random.nextInt(65)) + password.substring(1, password.length());
	      } else {
	        password = password.substring(0, i) + String.valueOf(pass.low.random.nextInt(65)) + password.substring(i + 1, password.length());
	      }
	    }
	    return password.toString();
	  }
	
	
	
	
}