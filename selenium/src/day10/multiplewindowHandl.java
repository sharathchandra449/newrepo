package day10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class multiplewindowHandl {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> it=id.iterator();
		while (it.hasNext()) 
		{
			String windowid=it.next();
			System.out.println(windowid);
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle()+"-----"+windowid);
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				System.out.println("In this page expected link not available");
			}
			
			
			
		}
		

	}

}
