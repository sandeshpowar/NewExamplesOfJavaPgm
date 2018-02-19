package JavaSerializationDemo;

import java.io.*;


public class ExpSerialization2Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Sample1 s1=new Sample1(10,20);
		FileOutputStream ous=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\java pgms 15-1\\example.txt");
		ObjectOutputStream ous1=new ObjectOutputStream(ous);
		ous1.writeObject(s1);
		ous1.close();
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\lenovo\\\\Desktop\\\\java pgms 15-1\\\\example.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Sample1 s2=(Sample1)ois.readObject();
		System.out.println(s2);
		ois.close();
		
		
		
	
		
	}

}
class Sample1 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient static int i;
	transient int j=20;
	
	public Sample1(int i,int j) {
		super();
		Sample1.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "\nSample1 [i=" + i + ", j=" + j + "]";
	}
	
	
	
	
	
	
	
}
