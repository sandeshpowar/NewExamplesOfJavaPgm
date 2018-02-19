package jdbcpracticepgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Expjdbcpgm1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con= null;
		
		Statement st= null;
		ResultSet rs= null;
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			 st=con.createStatement();
			// st.executeUpdate("insert into student values(2,'amol')");
			int i= st.executeUpdate("delete from sandesh where name='amol'");
			/*if(i==1)
			{
				System.out.println("Row Deleted Successfully"+i);
			}
			 */
			int i1= st.executeUpdate("update student set name='sandesh' where id=1");
			if(i1==1)
			{
				System.out.println("Row Updated Successfully"+i1);
			}
			 
			 rs=st.executeQuery("select * from student");
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			 }
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
			st.close();
			rs.close();
		}
		
		
		
		
		

	}

}
