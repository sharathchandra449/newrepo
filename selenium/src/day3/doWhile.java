package day3;

public class doWhile {

	public static void main(String[] args) 
	{
		int i=1;
		do {
			System.out.println(i);
			if (i==300)
			{
				break;
				
			}
			i=i+1;
		} while (i<=500);

	}

}
