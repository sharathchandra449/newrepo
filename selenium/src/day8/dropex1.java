package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropex1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://cleartrip.com");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("Adults"));
		
		Select s=new Select(drop);
		
		s.selectByIndex(4);
		Sleeper.sleepTightInSeconds(5);
		s.selectByValue("6");
		Sleeper.sleepTightInSeconds(5);
		s.selectByVisibleText("9");
		
		

	}

}
