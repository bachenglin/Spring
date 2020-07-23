package Collections;

import java.util.Arrays;

public class SortingUsingArrayEx {

	public static void main(String[] args) 
	{
		int [] a = {23,78,98,21,13,15};
		Arrays.parallelSort(a);
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
