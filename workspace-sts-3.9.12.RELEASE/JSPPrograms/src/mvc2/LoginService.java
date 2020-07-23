package mvc2;

public class LoginService 
{
   public boolean authenticate(String userId,String password)
   {
	   if(password == null || password.trim() == "")
	   {
		   return false;
	   }
	   return true;
   }
}

