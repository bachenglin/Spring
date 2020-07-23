package Task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	public static void WhileIterate(Map<String,Integer> hm)
	{	Iterator<Map.Entry<String, Integer>> entries = hm.entrySet().iterator();
		while (entries.hasNext())
		{
			Map.Entry<String, Integer> entry = entries.next();
			System.out.println("key = " + entry.getKey()+", value = "+ entry.getValue());
		}
	}
	public static void ForIterate(Map<String, Integer> hm)
	{
		for (Map.Entry<String, Integer> entry : hm.entrySet())
		{
			System.out.println("key = " + entry.getKey()+", value = "+ entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
        // Map is not Synchronized
	    // Map has "Key-Value" Pairs which we will call it as an "Entry".
	    hm.put("AB", 10);
	    hm.put("AC", 10);
	    hm.put("AD", 20);
	    hm.put("AE", 30);
	    hm.put("AF", 40);
	    System.out.println("while loop");
	   
	    WhileIterate(hm);
	    
	    System.out.println("for loop");
	    
	    ForIterate(hm);
	    
	    
	}

}
