package backup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkstest4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.xpath(".//*[@id='sc_hdu']/li/a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			
		}
 
	}

}
