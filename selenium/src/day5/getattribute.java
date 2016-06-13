package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getattribute {

	public static void main(String[] args) 
	{
		String expval="https://mail.google.com";
		WebDriver driver=new FirefoxDriver();
		
		driver.get("Http://google.com");
		
		driver.manage().window().maximize();
		
		String actval=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(actval);
		
		if (actval.contains(expval))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
