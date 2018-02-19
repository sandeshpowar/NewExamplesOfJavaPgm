package javaprograms;

public class Expthissuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		younger y1=new younger();
		
	}
}

class parent{
	static {
		System.out.println("Inside the Static Block Of Parent ");
		}
		{
		System.out.println("inside instance block of parent ");
		}
	public parent() {
		System.out.println("p");
		
	}
}
class child extends parent{
	static {
		System.out.println("Inside Child Static Block ");
	}
	{
		System.out.println("Inside Child Instance Block ");
	}
	public child(int i) {
		super();
		System.out.println("child"+i);
		
		
		
	}
	public child() {
		this(10);
		
		System.out.println("child default");
		
	
		
	}
}
class younger extends child{
	static{
		System.out.println("Inside Static of Younger Block ");
	}
	{
		System.out.println("Inside Instance of Younger Block");
	}

	public younger(){
		super();
		System.out.println("\n \t value of in younger block i \t");
		
		
	}
	
}
