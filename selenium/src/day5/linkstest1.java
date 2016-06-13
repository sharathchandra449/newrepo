package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkstest1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		
		WebElement block=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i <links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			
		}

	}

}
