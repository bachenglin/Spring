package Task1;

public class RemoveWhiteSpace {
	
	public static String Remove (String s)
	{	String res = "";
		for (int i = 0; i < s.length(); i++)
		{
			if ((s.charAt(i) != ' ') )
			{
				res += s.charAt(i);
			}
		}
		
		
		return res;
	}

	public static void main(String[] args) 
	{
		String s = "a b c d ajf";
		System.out.println("Before removing all white spaces: "+s);
		System.out.println("After removing all white spaces: "+ Remove(s));
		

	}

}
