package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autifill {

	public static void main(String[] args)
	{
		String expcity="harne";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("txtSource")).sendKeys("H");
		WebElement send=driver.findElement(By.id("txtSource"));
		send.sendKeys("H");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='Search']/div[1]/div[1]/ul/li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			String actcity=list.get(i).getText();
			System.out.println(actcity);
			if (expcity.equalsIgnoreCase(actcity))
			{
				System.out.println("The city exsit in the from city list");
				list.get(i).click();
				break;
				
				
			}
			
		}
	

	}

}
