package javaprograms;
public abstract class sampleabstract {
	
	abstract void m1();{
		System.out.println(" method m1  abstarct class ");
		System.out.println(" method m1  abstarct class ");
	}
	public void m2(){
		System.out.println("m2 Method abstact class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pEmployee s2 =new pEmployee();
		sampleabstract s3 =new cEmployee();
		sampleabstract s4 =new xEmployee();
		s2.m1();
		s2.m4();
	
		
		s3.m1();
		
		s4.m1();
//s4.m2();
		}
}
class pEmployee extends sampleabstract{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println(" PEmployee Class m1");
		
	}
	  int  m4() {
		System.out.println("info about an Permenent Employee");
		return 1000;
	}
	
}
class xEmployee extends sampleabstract{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println(" Xemployee Class M1");
	
	}
	int m3() {
		System.out.println("Info about an Xemployee");
		return 10000;
	}
	
}
class cEmployee extends sampleabstract{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println(" Cemployee Class M1");
		
	}
	  int m5() {
		System.out.println("info about an Contract Employee ");
		return 5000;
		
	}
	
}
