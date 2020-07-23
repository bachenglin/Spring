package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/clinicDB", "root", "12345678");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
