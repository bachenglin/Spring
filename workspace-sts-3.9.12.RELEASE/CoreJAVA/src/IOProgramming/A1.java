package IOProgramming;
import java.io.*;
class A
{
	int a;
	void f1(int b, int c)
	{
		a = b + c;
		System.out.println("Result is: " + a);
	}
}
public class A1 {

	public static void main(String[] args) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter a's value: ");
		String x = dis.readLine();
		int i = Integer.parseInt(x);
		System.out.println("Enter b's value: ");
		String y = dis.readLine();
		int j = Integer.parseInt(y);
		A obj = new A();
		obj.f1(i, j);
		dis.close();

	}

}
