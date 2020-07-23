package InnerClass;

public class Outer1 
{
	public void f1()
	{
		class Inner1
		{
			public void f2(int a, int b)
			{
				System.out.println(a + b);
			}
		}
		Inner1 i = new Inner1();
		i.f2(200, 300);
		i.f2(20, 50);
	}
	public static void main(String[] args) 
	{
		Outer1 obj = new Outer1();
		obj.f1();

	}

}
