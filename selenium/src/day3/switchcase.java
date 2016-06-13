package day3;

public class switchcase 
{

	public static void main(String[] args) 
	{
		String course="Qtp";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("you are selected selenium");
			break;
		case "Qtp":
			System.out.println("You are selected Qtp");
			break;
		case "LoadRunner":
			System.out.println("You are selected Loadrunner");
			break;

		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
