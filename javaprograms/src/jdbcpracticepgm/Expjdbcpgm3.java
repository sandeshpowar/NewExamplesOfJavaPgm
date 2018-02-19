package jdbcpracticepgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Expjdbcpgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		
		Statement st=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sandeshpowar","sandesh@123");
			st=con.createStatement();
			
			int i=st.executeUpdate("insert into stud29 values('summer')");
			if(i==1) {
				System.out.println(""+i);
			}
			
			
			ResultSet rs1=st.executeQuery("select * from stud29");
			while(rs1.next())
			{
				System.out.println(rs1.getString(1));
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println("error"+e);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
