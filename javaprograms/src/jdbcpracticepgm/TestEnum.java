package jdbcpracticepgm;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Weeks w= Weeks.mon;//We can Access enum constant reference with enum constant name bcuz it is static 
	System.out.println(w);//w.toString();internally called toString method
	
	w.m1();
	
	
	
	
		System.out.println(w.getId());

	
		
		
		

	}

}
