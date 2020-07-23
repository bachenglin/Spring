package Multithreading;
class A1 implements Runnable
{
public void run()
 {
for(int i=0;i<=5;i++)
	{
	System.out.println("a's class");
	}
 }
}
class B1 implements Runnable
{
public void run()
	{
	for(int i=0;i<=5;i++)
		{
		System.out.println("b's class");
		}
	}
}
class Impl
{
public static void main(String args[])
	{
	/*A1 a=new A1();
	Thread ob=new Thread(a);
	B1 b=new B1();
	Thread ob1=new Thread(b);*/
	Thread ob=new Thread(new A1());
	Thread ob1=new Thread(new B1());
	ob.start();
	ob1.start();
	}
}
