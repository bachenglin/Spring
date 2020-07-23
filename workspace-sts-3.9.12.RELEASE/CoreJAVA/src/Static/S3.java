package Static;

public class S3 {
	
	static
	{
		System.out.println("Static Block");
	}
	S3()
	{
		System.out.println("Local Class Constructor");
	}
	{
		System.out.println("Init Block");
	}
	public static void main(String[] args) 
	{	
		System.out.println("In Main Method");
		S3 s = new S3();
	}

}
