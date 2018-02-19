package JavaStringDemo;

public class ExpStringReverse7Demo {

	public static void main(String[] args) {
	
		StringBuffer stb=new StringBuffer("Sandesh");
		StringBuffer stb2=new StringBuffer(stb);
		
		System.out.println("Before Reverse Order-----String ="+stb2);
		stb2=stb2.reverse();
		System.out.println(stb2);
		
		
		
		
	}
}
