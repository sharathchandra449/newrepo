package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class selectitems {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		driver.switchTo().frame(0);
		
		List<WebElement> sel=driver.findElements(By.xpath(".//*[@id='selectable']/li"));
		System.out.println(sel.size());
		
		for (int i = 0; i < sel.size(); i++)
		{
			
			sel.get(i).click();
			Sleeper.sleepTightInSeconds(5);
		}

	}

}
