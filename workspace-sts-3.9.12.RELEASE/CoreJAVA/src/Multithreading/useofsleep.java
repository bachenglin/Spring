package Multithreading;
class A2 extends Thread
{
public void run()
	{
	for(int i=0;i<=5;i++)
		{
		if(i==0)
			{
			try
				{
			System.out.println("Thread enters into the waiting state of a's class");
			Thread.sleep(5000);
				}
				catch(Exception e){}
			}
			else
		System.out.println("a's class");
		}
	}
}
class B2 extends Thread
{
public void run()
	{
	for(int i=0;i<=5;i++)
		{
		System.out.println("b's class");
		}
	}
}
class useofsleep
{
public static void main(String args[])
	{
	A2 ob=new A2();
	B2 ob1=new B2();
	ob.start();
	ob1.start();
	}
}
