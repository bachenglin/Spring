package Task1;

import java.util.List;
import java.util.ArrayList;

public class IterateArrayList {
	public static void ForIterate(List<String> l)
	{
		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}
	public static void WhileIterate(List<String> l)
	{	int i = 0;
		while (i < l.size())
		{
			System.out.println(l.get(i));
			i++;
		}
	}
	public static void AdvanceForIterate(List<String> l)
	{	
		for(String s:l)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<>();
        l.add("India");
        l.add("China");
        l.add("USA");
        l.add("UK");
        System.out.println("For loop iteration:\n");
        ForIterate(l);
        System.out.println("while loop iteration:\n");
        WhileIterate(l);
        System.out.println("Advanced for loop iteration:\n");
        AdvanceForIterate(l);

	}

}
