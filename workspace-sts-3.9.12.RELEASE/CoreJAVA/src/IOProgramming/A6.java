package IOProgramming;
import java.io.*;
public class A6 {

	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file Name");
		String x = br.readLine();
		FileWriter fw = new FileWriter(x);
		String y = "how r u what u dng";
		fw.write(y);
		System.out.println("Data Written successfully");
		fw.close();
		br.close();
	}

}
