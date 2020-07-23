package Task1;

public class FindMissingNumbers {
	public static void FindMissing(int[] arr)
	{
		int[] res = new int[arr.length + 1];
		for(int i = 0; i< arr.length + 1; i++) {
			res[i] = 0;
		}
		
		for(int i: arr) {
			res[i] = 1;
		}
		System.out.println("Missing numbers are");
		for (int i = 1; i < arr.length + 1; i++)
		{
			if (res[i] == 0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		FindMissing(arr);
 
	}

}
