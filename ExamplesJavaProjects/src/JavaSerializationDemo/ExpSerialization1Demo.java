package JavaSerializationDemo;

import java.io.*;


public class ExpSerialization1Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Sample s1=new Sample(10,20);
		System.out.println(s1.i+"--------"+s1.j);
		FileOutputStream fous=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\java pgms 15-1\\sample.txt");
		ObjectOutputStream ous=new ObjectOutputStream(fous);
		ous.writeObject(s1);
		ous.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\java pgms 15-1\\sample.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Sample s2=(Sample)ois.readObject();
		System.out.println(s2.i+"-----"+s2.j);
		ois.close();
	
	}

}
class Sample implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	int j;
	
	public Sample(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Sample [i=" + i + ", j=" + j + "]";
	}
	

}