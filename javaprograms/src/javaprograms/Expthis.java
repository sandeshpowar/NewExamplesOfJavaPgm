package javaprograms;

public class Expthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		s3 sandesh=new s3(7);

	}

}
class s1{
	static {
		System.out.println("hello static of parent s1");
	}
	private static int i;
	{
		System.out.println("hello instance of parent s1");
	}
	public s1() {
		this(i);
	}
	public s1(int i) {
		this.i=i;
		System.out.println("value of i "+i);
	}
	
}
class s2 extends s1{

	public s2(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	
}
class s3 extends s2{

	public s3(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
}