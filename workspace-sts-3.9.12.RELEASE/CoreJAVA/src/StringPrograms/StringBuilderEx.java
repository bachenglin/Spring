package StringPrograms;

public class StringBuilderEx {

	public static void main(String[] args) 
	{
		StringBuilder sbd = new StringBuilder();
		sbd.append("marlabs");
		System.out.println("The String is:" + sbd);
		StringBuilder sbd2 = new StringBuilder(20);
		System.out.println("The String is:" + sbd2.capacity());

	}

}
