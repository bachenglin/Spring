package IOProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class A4 {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file Name");
		String x = br.readLine();
		FileReader fr = new FileReader(x);
		int y = fr.read();
		while(y != 1)
		{
			System.out.println((char)y);
			y = fr.read();
		}
	}

}
