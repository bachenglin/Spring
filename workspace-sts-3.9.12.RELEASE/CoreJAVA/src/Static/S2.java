package Static;

public class S2 
{	
	int x,y;
	static String name = "Nagendra";
	void f1(int a,int b) 
	{
		x = a;
		y = b;
		System.out.println(x + " "+ y +" "+ name);
		
	}
	static void change() 
	{
		name = "NANDA";
		

	}
	public static void main(String[] args) 
	{
		
		
		  S2 z1 = new S2(), z2 = new S2();
		  z1.f1(10, 20); 
		  z1.change(); 
		  z2.f1(100,200);
		  z2.change();
		 
	}	
	

}
