package backup;

public class nestedIf {

	public static void main(String[] args) 
	{
		int a=200;
		int b=3000;
		int c=40000;
		
		if (a > b & a > c) 
		{
			System.out.println("A is bigger");
		}
		else if (b>a & b>c) 
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}

	}

}
