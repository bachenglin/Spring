package Multithreading;
class reserve2 implements Runnable
{
int available=1;
int wanted;
reserve2(int i)
	{
	wanted=i;
	}
synchronized void check()
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
	
public void run()
	{
	check();
	}
	
}
class Safe1
{
public static void main(String args[])
	{
	reserve2 res=new reserve2(1);
	Thread t5=new Thread(res);
	Thread t6=new Thread(res);
	t5.setName("Song");
	t6.setName("Akshitha");
	t5.start();
	t6.start();
	}
}


