package Task1;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	public static void Count(String s)
	{
		Map<String, Integer> hm = new HashMap<>();
		String [] strs = s.split(" ");
		for (int i = 0; i< strs.length; i++)
		{
			if(!hm.containsKey(strs[i])) {
				hm.put(strs[i], 1);
			}
			else {
				int counts = hm.get(strs[i]);
				hm.put(strs[i], counts + 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
	Count("ab bc ce dc dc ");

	}

}
