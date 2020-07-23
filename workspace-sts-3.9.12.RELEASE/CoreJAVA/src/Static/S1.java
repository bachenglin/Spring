package Static;

public class S1 {
	static int x = 0;
	S1()
	{
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		S1 a1 = new S1();
		S1 a2 = new S1();
		S1 a3 = new S1();
		S1 a4 = new S1();
		S1 a5 = new S1();
	}

}
