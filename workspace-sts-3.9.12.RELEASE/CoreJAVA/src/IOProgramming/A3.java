package IOProgramming;
import java.io.*;
public class A3 
{

	public static void main(String[] args) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the file Name: ");
		String x = dis.readLine();
		FileInputStream fis = new FileInputStream(x);
		int y = fis.read();
		while(y != -1)
		{
			System.out.println((char)y);
			y = fis.read();
		}
		fis.close();
	}

}
