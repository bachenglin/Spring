package StringPrograms;

public class EqualsIgnoreCaseEx {

	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		String s4 = "abcdefgh";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s4.equalsIgnoreCase(s1));

	}

}
