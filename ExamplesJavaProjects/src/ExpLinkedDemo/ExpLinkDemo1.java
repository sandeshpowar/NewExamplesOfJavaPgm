package ExpLinkedDemo;

import java.util.LinkedList;

public class ExpLinkDemo1 {
	/**
	 * 
	 * @param args
	 * 
	 * 
	 */
	

	
	public static void main(String[] args) {
		
		LinkedList<student> l1=new LinkedList<>();
		LinkedList<student> l2=new LinkedList<>();
		
		student s1=new student(1, "A", "XYZ", 20);
		student s2=new student(2, "B", "ABC", 21);
		student s3=new student(3, "C", "PQR", 22);
		student s4=new student(4, "D", "LMN", 23);
		student s5=new student(5, "E", "SAD", 24);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		
		
		l2.addAll(l1);
		System.out.println("Size OF List---"+l1.size());
		System.out.println("Index Of S4 Object---"+l1.indexOf(s4));
		System.out.println(""+l1.add(null));
		System.out.println(""+l1.add(null));
		System.out.println("Size OF List---"+l1.size());
		System.out.println("remove----"+l1.removeFirst());
		System.out.println("Check Whether It IS Empty\t"+l2.isEmpty());
		
		
	
		
		
		/*System.out.println("Element of Second Element"+l2);
		
		System.out.println("***************Using For Loop***************");
		for (student stud : l1) {
			System.out.println(stud);
		}
		System.out.println("***************Using Iterator***************");
		Iterator<student> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}*/
		
		
		System.out.println(l1);
		}

}
class student {
	int id;
	String name;
	String Address;
	int age;
	public student(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nstudent [id=" + id + ", name=" + name + ", Address=" + Address + ", age=" + age + "]";
	};
	
}