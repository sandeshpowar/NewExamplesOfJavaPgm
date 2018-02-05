package JavaSamplePgm;

import java.util.LinkedList;
import java.util.List;

public class ExpSimpleClassDemo {

	public static void main(String[] args) {

		Sample s1=new Sample(07, "Sandesh Powar");
		Sample s2=new Sample(03, "Amol Jagdale");
		Sample s3=new Sample(04, "Ashutosh ");
		Sample s4=new Sample(01, "Rohit");
		Sample s5=new Sample(02, "Swapnil");
		
		
		List<Sample> l1=new LinkedList<>();//Using Linked List
		l1.add(s1);
		l1.add(s2);		
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		System.out.println("Given Set="+l1);
		
		
		
	}

}
class Sample
{
	int id;
	String name;
	public Sample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nSample [id=" + id + ", name=" + name + "]";
	}
	
}
