package StringPrograms;

public class StringBufferex {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("marlabs");
		int z = sb.length();
		System.out.println("Length is:" + z);
		//sb.reverse();
		//sb.replace(4,5,"xyz");
		char x [] = {'h','e'};
		sb.insert(3,x);
		
		System.out.println(sb);
		//sb.replace(4,6,"xyz");
		System.out.println(sb);
	

	}

}
