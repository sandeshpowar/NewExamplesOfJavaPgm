package JavaStringDemo;

public class ExpStringReverse6Demo {

	public static void main(String[] args) {
		
		String sa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sa=reverse(sa);
		System.out.println(sa);
		
		
		
		}
	public static String reverse(String str) {
		return  new StringBuilder(str).reverse().toString();
		
	}
}
