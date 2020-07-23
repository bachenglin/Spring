import java.sql.*;


public class ResultSetMetadataEx {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/triage","root","12345678");
		System.out.println("Connection Established Successfully");
		
		PreparedStatement ps = con.prepareStatement("select * from user");
		
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println("column count is "+ rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		con.close();

	}

}


