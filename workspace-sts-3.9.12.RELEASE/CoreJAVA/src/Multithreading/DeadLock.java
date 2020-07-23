package Multithreading;
class BookTicket extends Thread
{
	Object train, compt;
	BookTicket (Object train, Object compt)
	{
		this.train = train;
		this.compt = compt;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("BookTicket is blocked on train object");
			try
			{
				System.out.println("BookTicket is waiting to block on compt object");
				Thread.sleep(100);
				 
			}
			catch (Exception e)
			{
				
			}
			synchronized(compt)
			{
				System.out.println("Bookticket is blocked on compt object");
			}
		}
	}
}
class CancelTicket extends Thread
{
	Object train,compt;
	CancelTicket(Object train, Object compt)
	{
		this.train = train;
		this.compt = compt;
	}
	public void run()
	{
		synchronized(compt)
		{
			System.out.println("CancelTicket is blocked on compt object");
			try 
			{
				System.out.println("CancelTicket is waiting to block on train object");
				Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
			synchronized(train)
			{
				System.out.println("CancelTicket is blocked on train object");
			}
		}
	}
}

class DeadLock
{
	public static void main(String args[])
	{
		Object train = new Object();
		Object compt = new Object();
		BookTicket bt = new BookTicket(train,compt);
		CancelTicket ct = new CancelTicket(train,compt);
		bt.start();
		ct.start();
	}
}
