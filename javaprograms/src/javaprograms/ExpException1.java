package javaprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExpException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("G:\\new.text");
		try {
			FileReader fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
