package StringPrograms;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("my%name#is%Na","%#");
		System.out.println(st.countTokens());
		while (st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}

}
