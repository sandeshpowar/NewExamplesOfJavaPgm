package javaprograms;

public class ExpStringDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcdefghijklmnopqrstuvwxyz";
		String str1="abc";
		
	/*	if(str.contentEquals(str1)) {                         
			System.out.println("Both String are same");
		}                                                        //For Comparing Two String
		else {
			System.out.println("Both String Are not Same ");
		}
		*/
		if(str==str1) {
			System.out.println("Both String are same");
		}else {													//For Comparing Two String 
			System.out.println("BOth String are Not Same ");
		}
		
		
		/*StringBuilder st=new StringBuilder(str);
		StringBuilder s4=st.reverse();							//For Sting Reverse
		System.out.println("Reverse String\t\n"+s4);
		
		StringBuffer stb=new StringBuffer(str);
		System.out.println(stb.reverse());						//For String Reverse using String Buffer Method
		*/
		
		
		/*char str5[]=str.toCharArray();
		for(int i=str5.length-1;i>=0;i--) {
			System.out.print(str5[i]);				// For String Reverse Using toCharArray method
		}*/
		
		String reverse = null;
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);				//For String Reverse Using charAt method 
			//System.out.print(str.charAt(i));
			
		}
		System.out.println(reverse);
		
		String str7=str.substring(5);
		System.out.println(str7);
		
		String str8=str.substring(1, 12);
		System.out.println(str8);
		
		String st45="Sandesh";					//We Can Separate String With Any Character Specified in Split Function With " any op,sym,char"; 
		String[] s=st45.split("");
		for (String a : s) {
			System.out.println(a);
		}
		
		
		
		
	}

}
