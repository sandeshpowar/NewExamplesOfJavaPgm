package jdbcpracticepgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Expjdbcpgm2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			st=con.createStatement();
			
		/*	int i=st.executeUpdate("delete form student where name='sandesh'");
			if(i==1) {
				System.out.println("row deleted Successfully"+i);
			}*/
			
			
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			 }
			
				}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
			st.close();
			rs.close();
		}
	}

	
	}


