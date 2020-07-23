import java.sql.*;


public class SimpleStatementEx {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
		System.out.println("Connection Established Successfully");
		Statement st = con.createStatement();
		int i = st.executeUpdate("insert into student(name,pwd)values('marlabs','java')");
		System.out.println(i);
		ResultSet rs = st.executeQuery("select * from student");
		while (rs.next())
		{
			System.out.println(rs.getString(1)+" "+ rs.getString(2));
		}
		con.close();
		
	
	}

}
