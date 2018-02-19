package javaprograms;

import java.io.File;
import java.io.FileReader;

public class ExpExceptionFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			File file=new File("C:\\Users\\lenovo\\Desktop\\java.txt");
			String x=FileReader(file);
			System.out.println("Given Message\t\t"+x);
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}
	}

	private static String FileReader(File file) {
		String xyz = "sandesh";
		// TODO Auto-generated method stub
		return xyz;
	}

}
