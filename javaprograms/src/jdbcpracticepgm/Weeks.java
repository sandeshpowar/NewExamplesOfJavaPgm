package jdbcpracticepgm;

public enum Weeks {
				sun(1),mon(2),tue(3),wed(4),thur(5),fri(6),sat(7);
	private int id;
	public void m1() 
	{
		int i=1;
		for(i=0;i<5;i++)
		{
		int i1=i+1;
		System.out.println(i1);
		}
	}
	Weeks(int i){
		id=i;
	}
	int getId() {
		return id;
		
	}

	
}
