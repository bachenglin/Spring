package Collections;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("/Users/bachenglin/Documents/workspace-sts-3.9.12.RELEASE/CoreJAVA/suda.properties");
		System.out.println("File is Created Successfully");
		Properties p = new Properties();
		p.put("username", "Raj");
		p.put("password", "123");
		p.store(fos, "detail are: ");
		System.out.println("Deatils Entered the file successfully");
		fos.close();

	}

}
