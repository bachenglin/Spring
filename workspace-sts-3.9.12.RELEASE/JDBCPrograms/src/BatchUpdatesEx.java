import java.sql.*;




public class BatchUpdatesEx {

	public static void main(String[] args) throws Exception
	{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
		   // Connection Establishment
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
	       System.out.println("Connection Established Successfully");
	       con.setAutoCommit(false);
	       // Creation of Simple Statement
	     //5.获取执行sql语句的对象 Statement
	       Statement st=con.createStatement();
	       st.addBatch("insert into emp21 values(101,'BA CHENLIN',80000)");
	       st.addBatch("insert into emp21 values(102,'ABDULLAH',85000)");
	       st.addBatch("insert into emp21 values(103,'HAIPING ZHU',90000)");
	       st.executeBatch();
	       con.commit();
	       // Closing the Connection
	       con.close();
		

	}

}
