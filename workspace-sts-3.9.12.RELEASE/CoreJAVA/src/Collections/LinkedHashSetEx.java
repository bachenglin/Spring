package Collections;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) 
	{
		Set<String> hs = new HashSet<>();
		hs.add("ab");
		hs.add("ab");
		hs.add("ac");
		hs.add("ad");
		hs.add("usa");
		System.out.println(hs.size());
		System.out.println(hs.contains("usa"));
		System.out.println(hs.remove(0));
		for (String x:hs)
		{
			System.out.println(x);
		}

	}

}
