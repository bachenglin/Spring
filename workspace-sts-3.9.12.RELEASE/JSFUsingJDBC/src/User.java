import java.sql.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class User{
	String name;
	String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean save()
	{
		int x = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user123","root","12345678");
			System.out.println("Connection Established with the database");
			PreparedStatement ps = con.prepareStatement("insert into user(name,email) values(?,?)");
			ps.setString(1,this.getName());
			ps.setString(2, this.getEmail());
			x = ps.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		if (x == 1)
		{return true;}
		else
			return false;
	}
	public String submit()
	{
		if (this.save())
		{
			return "response.xhtml";
		}
		else
			return "index.xhtml";
	}
	
	
}