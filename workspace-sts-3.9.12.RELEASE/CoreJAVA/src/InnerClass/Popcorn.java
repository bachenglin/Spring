package InnerClass;

public class Popcorn 
{
	void taste()
	{
		System.out.println("Salty");
	}
	public static void main(String[] args) 
	{
		Popcorn p1 = new Popcorn()
				{
					void taste()
					{
						System.out.println("sweety");
					}
				};
		p1.taste();
		Popcorn p2 = new Popcorn();
		p2.taste();
		Popcorn p3 = new Popcorn()
		{
			void taste()
			{
				System.out.println("spicy");
			}
		};
		p3.taste();
	}

}
