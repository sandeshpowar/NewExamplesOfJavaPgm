package ExpJavaClone;

public class ExpClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad=new Address("pune", 124578);
		Emp e1=new Emp(1, "Sandesh", ad);
		Emp e2=(Emp) e1.clone();
		
		
		/*System.out.println(e1.equals(e2));
		System.out.println(e1.getClass()==e2.getClass());
		System.out.println(e1==e2);*/
		
		System.out.println("Before Set VAlues");
		System.out.println("E1--"+e1);
		System.out.println("E2--"+e2);
		e2.setName("Amol");
		ad.setCity("Kolhapur");
		System.out.println("After Set The VAlues ");
		System.out.println("e1--"+e1);
		System.out.println("E2--"+e2);
		
	}

}
class Emp implements Cloneable{
	int id;
	String name;
	Address ad;
	public Emp(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	public Emp(Emp e1) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", ad" + ad + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
class Address{
	String city;
	int pin;
	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "[city=" + city + ", pin=" + pin + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	/*public void setPin(int pin) {
		this.pin = pin;
	}*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}