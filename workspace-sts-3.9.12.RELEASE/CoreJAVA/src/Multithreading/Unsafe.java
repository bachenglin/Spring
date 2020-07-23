package Multithreading;
class reserve1 implements Runnable
{
int available=1;
int wanted;
reserve1(int i)
	{
	wanted=i;
	}
public void run()
	{
	if(available>=wanted)
	{
    System.out.println("Available berths is:"+available);
	String n=Thread.currentThread().getName();
	System.out.println(available+":berth is reserved to passenger:"+n);
	try
		{
		System.out.println("Transaction is under processing");
		Thread.sleep(5000);
		available=available-wanted;
		}
	catch(Exception e){}
	}
	else
		System.out.println("Sorry no berths");
	}
}
class Unsafe
{
public static void main(String args[])
	{
	reserve1 res1=new reserve1(1);
	Thread t3=new Thread(res1);
	Thread t4=new Thread(res1);
	t3.setName("Vrushank");
	t4.setName("Peng");
	t3.start();
	t4.start();
	}
}


