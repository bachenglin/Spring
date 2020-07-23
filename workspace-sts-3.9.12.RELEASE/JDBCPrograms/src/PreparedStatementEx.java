import java.sql.*;



public class PreparedStatementEx {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
		System.out.println("Connection Established Successfully");
		//Statement st = con.createStatement();
		//int i = st.executeUpdate("insert into student(name,pwd)values('marlabs','java')");
		//System.out.println(i);
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?)");
		ps.setInt(1, 200);
		ps.setString(2, "JIGAR SOLANKI");
		int i = ps.executeUpdate();
		ResultSet rs = ps.executeQuery("select * from student");
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+" "+ rs.getString(2));
		}
		con.close();

	}

}
