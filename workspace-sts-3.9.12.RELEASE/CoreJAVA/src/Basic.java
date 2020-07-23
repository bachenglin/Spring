
public class Basic 
{
	int a = 10;
	void f1(int b, int c) {
		//System.out.println(a);
		/*
		 * System.out.println(b); System.out.println(c);
		 */
		System.out.println( b + " " + c);
	}
	Basic()
	{
		System.out.println("It is a constructor");
	}
	Basic(int x, int y)
	{
		System.out.println(x + y);
	}
	public static void main(String[] args) {
		Basic b1 = new Basic(),b2 = new Basic(),b3 = new Basic();
		b1.f1(20,  30);
		System.out.println(b1.a);
		//Basic b2 = new Basic();
		b2.a = 100;
		System.out.println(b2.a);
		//Basic b3 = new Basic();
		b3.a = 1000;
		System.out.println(b3.a);
	}

}
