package JavaSamplePgm;

public class ExpWrapperDemo {

	public static void main(String[] args) {
		
		
		//System.out.println("***********Wrapper classes are mainly used to wrap the primitive content into an object. This operation of wrapping primitive content into an object is called boxing***********");
		System.out.println("**********************Boxing Demo**********************");
		
		boolean bln=true;
		Boolean Bln=bln;
		System.out.println("Primitives to Wrapper (Boolean)"+Bln);
		
		byte b=10;
		Byte B=new Byte(b);
		System.out.println("1.Primitive to Wrapper (Byte)\t"+B);
		
		int i=10;
		Integer I=new Integer(i);
		System.out.println("2.Primitive to Wrapper(Integer) \t"+I);
		
		short s=10;
		Short S=new Short(s);
		System.out.println("3.Primitive to Wrapper(Short) \t"+S);
		
		float f=(float) 10.2;
		Float F=new Float(f);
		System.out.println("4.Primitive to Wrapper(Float) \t"+F);
		
		char c='c';
		Character C=new Character(c);
		System.out.println("5.Primitive to Wrapper(Character) \t"+C);
		
	    double d=10.2;
	    Double D=new Double(d);
	    System.out.println("6.Primitive to Wrapper(Double) \t"+D);
	    
	    long l=10;
	    Long L=new Long(l);
	    System.out.println("7.Primitive to Wrapper(Long) \t"+L);
	    System.out.println("==================================================================");
		
//	    System.out.println("you need not to explicitly wrap the primitive content into an object. Just assign primiive data to corresponding wrapper class reference variable, java automatically wraps primitive data into corresponding wrapper object.");
		
	    System.out.println("*************************Auto Boxing*************************");
	//	System.out.println("assign primitive data to corresponding wrapper class reference variable, java automatically wraps primitive data into corresponding wrapper object.");
		byte b1=10;
		Byte B1=b1;
		System.out.println("1.Auto Boxing "+"the primitives content into object\t"+B1);
		
		short s1=20;
		Short S1=s1;
		System.out.println("2.Auto Boxing for Short\t"+S1);
		
		int i1=50;
		Integer I1=i1;
		System.out.println("3.Auto Boxing for Integer\t"+I1);
		
		long l1=90;
		Long L1=l1;
		System.out.println("4.Auto Boxing for long\t"+L1);
		
		char c1='s';
		Character C1=c1;
		System.out.println("5.Auto Boxing for Character\t"+C1);
		
		float f1=(float) 10.2;
		Float F1=f1;
		System.out.println("6.Auto Boxing for Float\t"+F1);
		
		double d1=40;
		Double D1=d1;
		System.out.println("7.Auto Boxing for Double\t"+D1);
		
		boolean bln1=true;
		Boolean Bln1=bln1;
		System.out.println("Auto Boxing for Boolean\t"+Bln1);
		
		System.out.println("==================================================================");
		
		System.out.println("*****************UnBoxing--Wrapper Object To Primitives***************** ");
		Byte B2=new Byte((byte)10);
		byte b2=B2.byteValue();
		System.out.println("1.UnBoxing Wrapper To Primitives\t"+b2);
		
		Short S2=new Short((short) 10);
		short s2=S2.shortValue();
		System.out.println("2.UnBoxing Wrapper To Primitives\t"+s2);
		
		Integer I2=new Integer(20);
		int i2=I2.intValue();
		System.out.println("3.UnBoxing Wrapper To Primitives \t"+i2);
		
		Character C2=new Character('s');
		char c2=C2.charValue();
		System.out.println("4.UnBoxing Wrapper To Primitives \t"+c2);
		
		Boolean Bln2=new Boolean(true);
		boolean bln2=Bln2.booleanValue();
		System.out.println("5.UnBoxing Wrapper To Primitives\t"+bln2);
		
		Float F2=new Float(10.2);
		float f2=F2.floatValue();
		System.out.println("6.UnBoxing Wrapper To Primitives \t"+f2);
		
		Double D2=new Double(20);
		double d2=D2.doubleValue();
		System.out.println("7.UnBoxing Wrapper To Primitives \t"+d2);
		
		System.out.println("********************* Auto UnBoxing *********************");
		Byte B3=new Byte((byte) 10);
		byte b3=B3;
		System.out.println("Auto Unboxing for Byte\t"+b3);
		
		Integer I3=new Integer(10);
		int i3=I3;
		System.out.println("Auto Unboxing for int\t"+i3);
		
		Character C3=new Character('s');
		char c3=C3.charValue();
		System.out.println("Auto Unboxing for char\t"+c3);
		
		System.out.println("Hello");
		
		
		
		
	
	
	}

}
