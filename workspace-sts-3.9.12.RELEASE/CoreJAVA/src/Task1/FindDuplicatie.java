package Task1;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatie {
	public static void FindDuplicateCharacter(String s)
	{
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i< s.length(); i++)
		{	if (s.charAt(i) == ' ')
		{
			continue;
		}
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			}
			else {
				int counts = hm.get(s.charAt(i));
				hm.put(s.charAt(i), counts + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet())
		{	if (entry.getValue()>1)
			{System.out.println("duplicate character = " + entry.getKey()+", times = "+ entry.getValue());}
		}
		
		
	}

	public static void main(String[] args) 
	{
		String s = "abcda cd ";
		FindDuplicateCharacter(s);
		

	}

}
