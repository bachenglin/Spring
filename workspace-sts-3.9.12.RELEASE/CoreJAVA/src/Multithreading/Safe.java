package Multithreading;
class reserve implements Runnable
{
	int available = 1;
	int wanted;
	reserve(int i)
	{
		wanted = i;
	}
	public void run()
	{
		synchronized(this)
		{
			if(available >= wanted)
			{
				System.out.println("Available berths is:" + available);
				String n = Thread.currentThread().getName();
				System.out.println(available + ":berth is reserved to passenger:" + n);
				try
				{
				System.out.println("Transaction is under processing");
				Thread.sleep(5000);
				available = available - wanted;
				}
				catch (Exception e)
				{
					
				}
			}
			else
			{
				System.out.println("Sorry no berths");
			}
		}
	}
}
class Safe
{
public static void main(String args[])
	{
		reserve res = new reserve(1);
		Thread t1 = new Thread(res);
		Thread t2 = new Thread(res);
		t1.setName("sai");
		t2.setName("lakhsman");
		t1.start();
		t2.start();
	}
}
