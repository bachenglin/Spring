package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/auction_fraud?useUnicode=true&characterEncoding=UTF-8", "root", "12345678");
            System.out.println("Connection Established"+con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 			
		
			
		return con;
	}
	
}
