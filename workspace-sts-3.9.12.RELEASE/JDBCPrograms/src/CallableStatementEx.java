import java.sql.*;


public class CallableStatementEx {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
		System.out.println("Connection Established Successfully");
		CallableStatement st = con.prepareCall("{call insertP(?,?)}");
		
		st.setInt(1, 298);
		st.setString(2, "abcd");
		st.execute();
		System.out.println("successfully done");
		con.close();
	}

}
