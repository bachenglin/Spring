package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectionEx {

	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
		l.add(24);
		l.add(12);
		l.add(96);
		l.add(58);
		l.add(43);
		l.add(79);
		Collections.sort(l);
		for(int x:l)
		{
			System.out.println(x);
		}

	}

}
