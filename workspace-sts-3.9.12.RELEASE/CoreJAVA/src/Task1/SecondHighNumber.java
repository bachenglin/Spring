package Task1;

public class SecondHighNumber {
	public static int FindNumber(int[] arr)
	{	
		int sec_Max = -32767;
		int Max = arr[0];
		for(int i = 0; i <arr.length; i++)
	{	
		if (arr[i] > Max)
		{
			sec_Max = Max;
			Max = arr[i];
		}
		else
		{
			if (arr[i] > sec_Max)
			{
				sec_Max = arr[i];
			}
		}
	}
		return sec_Max;
	}

	public static void main(String[] args) 
	{
		
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 5;
		arr[3] = 9;
		arr[4] = 4;
		System.out.println("Second Highest number is :" + FindNumber(arr));
		
	}

}
