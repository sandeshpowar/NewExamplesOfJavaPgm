package JavaStringDemo;

public class ExpStringReverse5Demo {
	
	public static void main(String[] args) {
		
		
		/*
		1. The last method is converting string into bytes .  getBytes()  method  is used to convert the input string into bytes[].
		2. Then we will create a temporary byte[]  of length equal to the length of the input string.
		3. We will store the bytes(which we get by using getBytes() method) in reverse order   into the temporary byte[] .
		*/
		
		
		
		
		String input="Be in Present";
		byte[]strb=input.getBytes();
		byte[]result=new byte[strb.length];
		
		for(int i=0;i<strb.length;i++) {
			result[i]=strb[strb.length-i-1];
		}
		System.out.println(new String(result));
	}

}
