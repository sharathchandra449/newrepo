package functions;

public class basicfunctions
{

	public static void main(String[] args) 
	{
		function1();
		
		boolean res=function2();
		System.out.println(res);
		
		basicfunctions basic=new basicfunctions();
		basic.function3();
		
		String res1=basic.function4();
		System.out.println(res1);
		//Note 1 :static methods will accept only static functions , static variables
		//Note 2: Non static methods will accept static functions and Non static functions
		      // static variables and non static variables

	}
	
	//static function without returning any value
	
	public static void function1()
	{
		System.out.println("This is code for function1");
	}
	
	//static function with returning some value
	
	public static boolean function2()
	{
		System.out.println("This is function2 code");
		return true;
	}
	
	//non static function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//non static function with returning value
	public String  function4()
	{
		System.out.println("This is code for finction4");
		return "Fail";
	}
	
	

}
