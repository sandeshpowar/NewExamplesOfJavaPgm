package javaprograms;

public abstract class Emp {
	abstract void m1();
	public  void m2() 
	{
		System.out.println("Main Emp m2");
	}
}
class Pemp extends Emp
{

	@Override
	void m1() {
		System.out.println("P employee m1");
	}
	public  void m2() {
		
		System.out.println("PEmp m2");
	}

	


	
}