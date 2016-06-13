package backup;

import java.util.Scanner;

public class ifCond {

	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value");
		a=sc.nextInt();
		System.out.println(a);
		int b;
		System.out.println("Enter B value");
		b=sc.nextInt();
		System.out.println(b);
		if (a > b) 
		{
			System.out.println("A is bigger than B");
			
		}
		else
		{
			System.out.println("B  is bigger");
		}
				

	}

}
