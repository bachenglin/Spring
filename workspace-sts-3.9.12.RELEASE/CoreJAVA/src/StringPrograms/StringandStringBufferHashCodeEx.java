package StringPrograms;

public class StringandStringBufferHashCodeEx {

	public static void main(String[] args) 
	{
		String s1 = "mar";
		System.out.println(s1.hashCode());
		s1 = s1 + "labs";
		System.out.println(s1.hashCode());
		StringBuffer s3 = new StringBuffer("mar");
		System.out.println(s3.hashCode());
		s3.append("labs");

		System.out.println(s3.hashCode());
	}

}
