package JavaSerializationDemo;

import java.io.*;


public class ExpSerializationDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1=new Employee(1, "Sandy");
		FileOutputStream fous=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\java pgms 15-1\\abc2.txt");
		ObjectOutputStream oos1=new ObjectOutputStream(fous);
		oos1.writeObject(e1);
		oos1.close();
		
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\java pgms 15-1\\abc2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ois.readObject();
		ois.close();
		
		
	}
	
}
class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}