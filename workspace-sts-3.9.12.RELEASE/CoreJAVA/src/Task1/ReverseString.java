package Task1;

public class ReverseString {
	public static String Reverse(String s)
	{
		int length = s.length();
		String reverse = "";
		for(int i = 0; i<length; i++)
		{
			reverse = s.charAt(i) + reverse;
		}
		return reverse;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Reverse("abcdefg"));
		
		
	}

}
