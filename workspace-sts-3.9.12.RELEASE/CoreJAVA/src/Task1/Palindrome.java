package Task1;

public class Palindrome {
	
	public static boolean StrPalindrome(String s)
	{	
		int l = s.length();
		int count = 0;
		for (int i = 0; i<s.length()/2; i++)
		{
			if (s.charAt(i) == s.charAt(l - i - 1))
			{
				count ++;
			}
		}
		if (count == s.length()/2)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static boolean IntPalindrome(int k)
	{	
		int x = k, sum = 0;
		while (k!= 0)
			{sum = sum * 10 + (k%10);
			k = k/10;
			}
		
		if (sum == x){
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(StrPalindrome("aba"));
		System.out.println(StrPalindrome("abba"));
		System.out.println(StrPalindrome("abc"));
		System.out.println(IntPalindrome(123));
		System.out.println(IntPalindrome(222));
		System.out.println(IntPalindrome(234));
		System.out.println(IntPalindrome(353));
		

	}

}
