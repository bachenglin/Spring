package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueEx 
{

	public static void main(String[] args) 
	{
		Deque<Integer> dq = new ArrayDeque<>();
		dq.offerFirst(20);
		dq.offerLast(45);
		dq.offerFirst(30);
		dq.offerLast(25);
		for(int x:dq)
		{
			System.out.println(x);
		}

	}

}
