package day5;

public class equalsignorecase {

	public static void main(String[] args) 
	{
		String expval="selenium";
		String actval="Selenium";
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
