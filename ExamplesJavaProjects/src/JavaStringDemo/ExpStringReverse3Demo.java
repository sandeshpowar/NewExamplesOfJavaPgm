package JavaStringDemo;

public class ExpStringReverse3Demo {
	public static void main(String[] args) {
		
		/*
		1. Convert the input string into character array by using the toCharArray() built in method of the String Class .
		2. In this method we will scan the character array from both sides , that is from the start index (left) as well as from last index(right) simultaneously.
		3. Set the left index equal to 0 and right index equal to the length of the string -1.
		4. Swap the characters of the start index scanning with the last index scanning  one by one .After that  increase the left index by 1 (left++) and decrease the right by 1 i.e (right--) to move on to the next characters in the character array .
		5. Continue till left is less than or equal to the right .*/
		
		String s1="Sample Program ";
		char[] c1=s1.toCharArray();//toCharArray--- it will convert string to new array
		int l,r=0;
		r=c1.length-1;
		for (l=0;l<r;l++,r--) {
			char temp=c1[l];
			c1[l]=c1[r];
			c1[r]=temp;
		}
		for (char c : c1) {
			System.out.print(c);
			//System.out.println();
		}
		
	}

}
