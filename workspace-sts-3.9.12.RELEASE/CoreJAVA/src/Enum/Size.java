package Enum;

public enum Size 
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public String getSize()
	{
		switch(this)
		{
		case SMALL:
			return "samll";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extralarge";
		default:
			return null;
		
		}
	}
	public static void main(String args[])
	{
		System.out.println(Size.SMALL);
	}
}
