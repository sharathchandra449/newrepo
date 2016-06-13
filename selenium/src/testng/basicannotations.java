package testng;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicannotations 
{
	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is function1 code");
	}
	
////	@Test(enabled=false)
////	@Test()
	@Test(priority=1)
	public void function2()
	{
		System.out.println("This is function2 code");
////		throw new SkipException("I don't want to execute this code");
	}

	@Test(priority=2)
	public void a()
	{
		System.out.println("This is a code");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is after method ");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is after class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is after test");
	}
	

}
