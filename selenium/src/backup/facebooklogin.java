package backup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class facebooklogin {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		//findElement
		driver.findElement(By.id("email")).sendKeys("gande3@gmail.com");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.name("pass")).sendKeys("1234567");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		
		

	}

}
