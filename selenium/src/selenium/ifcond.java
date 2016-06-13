package selenium;

import java.util.Scanner;

public class ifcond
{

	public static void main(String[] args) 
	{
//		int a=100;
//		int b=40;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if (a > b) 
		{
			System.out.println("a is bigger");
			
		}
		else
		{
			System.out.println("b is bigger");
		}

	}

}
