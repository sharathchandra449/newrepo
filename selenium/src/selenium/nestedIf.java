package selenium;

public class nestedIf {

	public static void main(String[] args)
	{
		int a=40;
		int b=50;
		int c=70;
		
		if (a > b & a>c) 
		{
			System.out.println("a is greater");
			
		}
		else if (b>a & b>c)
		{
			System.out.println("b is greater");
			
		}
		else
		{
			System.out.println("c is greater");

		}

	}

}
