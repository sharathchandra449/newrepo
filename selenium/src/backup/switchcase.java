package backup;

public class switchcase 
{

	public static void main(String[] args) 
	{
		String tools="qtp";
		
		switch (tools) {
		case "Qtp":
			System.out.println("This is Qtp");
			break;
		case "Selenium":
			System.out.println("This is Selenium");
			break;
		case "Loadrunner":
			System.out.println("This is Loadrunner");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
