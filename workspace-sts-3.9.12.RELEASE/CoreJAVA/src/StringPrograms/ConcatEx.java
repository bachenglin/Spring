package StringPrograms;

public class ConcatEx {

	public static void main(String[] args) 
	{
		String s1 = "www";
		String s2 = "marlabs";
		String s3 = "com";
		String s4 = s1.concat(".").concat(s2).concat(".")
.concat(s3);
		System.out.println(s4);
	}

}
