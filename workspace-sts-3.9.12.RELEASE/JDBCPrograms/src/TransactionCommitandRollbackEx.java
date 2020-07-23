

import java.io.*;
import java.sql.*;


public class TransactionCommitandRollbackEx {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/May1","root","12345678");
		System.out.println("Connection Established Successfully");
		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement("insert into emp1234 values(?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter the ID:");
			String s1 = br.readLine();
			int id = Integer.parseInt(s1);
			System.out.println("Enter the name:");
			String name = br.readLine();
			System.out.println("Enter the salary:");
			String s2 = br.readLine();
			int salary = Integer.parseInt(s2);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.executeUpdate();
			System.out.println("commit/rollback");
			String s3 = br.readLine();
			if (s3.equals("commit"))
			{
				con.commit();
			}
			if (s3.equals("rollback"))
			{
				con.rollback();
			}
			System.out.println("Wanted to Add more new Records YES/NO");
			String s4 = br.readLine();
			if (s4.equals("NO"))
			{
				break;
			}
			if (s4.equals("YES"))
			{
				con.rollback();
			}
		}
		con.commit();
		System.out.println("Records Successfully Inserted to Database");
		con.close();

	}

}
