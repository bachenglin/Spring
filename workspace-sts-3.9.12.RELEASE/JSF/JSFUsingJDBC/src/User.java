import java.sql.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class User {
	String userName;
	String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    public boolean save()
    {
    	int x=0;
    	try
    	{
    		/*mysql> create database user0123;
    		Query OK, 1 row affected (0.15 sec)
    		mysql> use user0123;
    		Database changed
    		mysql> create table user(name varchar(30),email varchar(30));
    		Query OK, 0 rows affected (0.54 sec)*/
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver Loaded Successfully");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user0123","root","root");
    		System.out.println("Connection Established with the Database");
    		PreparedStatement ps=con.prepareStatement("insert into user(name,email) values(?,?)");
    		ps.setString(1, this.getUserName());
    		ps.setString(2, this.getEmail());
    		x=ps.executeUpdate();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	if(x == 1)
    	{
    		return true;
    	}
    	else
    		return false;
    }
    public String submit()
    {
    	if(this.save())
    	{
    		return "response.xhtml";
    	}
    	else
    		return "index.xhtml";
    }
}
