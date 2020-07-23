
public class S2 {
	int x,y;
	static String name = "NAGENDRA";
	void f1(int a, int b)
	{
		x = a;
		y = b;
		System.out.println(x+ " "+y + " "+ name);
	}
	static void change()
	{
		name = "NANDA";
		System.out.println(name);
	}
	public static void main(String[] args)
	{	S2.change();
		/*
		 * S2 z1 = new S2(), z2 = new S2(); z1.f1(10, 20); z2.f1(100, 200);
		 */
	}

}
