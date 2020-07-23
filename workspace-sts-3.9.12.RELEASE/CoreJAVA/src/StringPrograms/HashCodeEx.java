package StringPrograms;

public class HashCodeEx {

	public static void main(String[] args) 
	{
		String s1 = "";
		String s2 = "hello";
		String s3 = "hello";
		String s4 = "Hello";
		String s5 =s4;
		String s6 = new String ("hello");
		if (s3.hashCode() == s4.hashCode())
		{
			System.out.println("Strings are the same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
		System.out.println("Empty String is: "+ (s3.hashCode() - s4.hashCode()));
	}

}
