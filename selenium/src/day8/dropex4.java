package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropex4 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement drop=driver.findElement(By.name("country"));
		
		Select s=new Select(drop);
		
		List<WebElement> city=s.getOptions();
		
		for (int i = 0; i <city.size(); i++)
		{
			s.selectByIndex(i);
			System.out.println(city.get(i).getText()+" "+city.get(i).getAttribute("value"));
			
		}
		
	}

}
