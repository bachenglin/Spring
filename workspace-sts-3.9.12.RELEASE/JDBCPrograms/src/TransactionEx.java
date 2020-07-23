import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionEx {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
		System.out.println("Connection Established Successfully");
		con.setAutoCommit(false);
		
		Statement st = con.createStatement();
		
		st.executeUpdate("insert into emp123 values(100,'Palak Patel', 5000)");
		st.executeUpdate("insert into emp123 values(100,'Sachel', 55000)");
		con.commit();
		con.close();
		

	}

}
