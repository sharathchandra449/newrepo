package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ieLaunch {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		//manage()
		
		driver.manage().window().maximize();
		
		//findelement()
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
		

	}

}
