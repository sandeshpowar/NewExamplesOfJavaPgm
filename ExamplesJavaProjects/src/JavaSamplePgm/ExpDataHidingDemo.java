package JavaSamplePgm;

public class ExpDataHidingDemo {

	public static void main(String[] args) {
		Sample2 se=new Sample2(1, "s", "XYZ",5);
		System.out.println(se);
		
		
	
		
	}

}
class Sample1{
	private int id;
	String Name;
	private String Address;
	public Sample1(int id, String name, String address) {
	
		this.id = id;
		Name = name;
		Address = address;
		
		}
	@Override
	public String toString() {
		return "\n\tSample [id=" + id + ", Name=" + Name + ", Address=" + Address + "]\n";
	}
	
}
class Sample2 extends Sample1{

	public Sample2(int i, String n, String a,int r) {
		super(i, n, a);
		int roll=r;
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	//@Override
	/*public String toString() {
		return "\nSample2 [Name=" + Name + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}*/
	
}