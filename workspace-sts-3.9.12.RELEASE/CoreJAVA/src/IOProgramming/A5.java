package IOProgramming;
import java.io.*;

public class A5 
{

	public static void main(String[] args) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the File Name: ");
		String x = dis.readLine();
		FileOutputStream fos = new FileOutputStream(x);
		String y = "Hello folks, Welcome to Marlabs";
		byte b[] = y.getBytes();
		fos.write(b);
		System.out.println("Data written sussfully");
		fos.close();
		dis.close();
	}

}
