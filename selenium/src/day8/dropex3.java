package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropex3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://khuranatravel.com");
		driver.manage().window().maximize();
		WebElement fdrop=driver.findElement(By.id("fromCity"));	
		Select s=new Select(fdrop);
		List<WebElement> fromdrop=s.getOptions();
		
		System.out.println(fromdrop.size());
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		
		for (int i = 0; i < fromdrop.size(); i++) 
		{
			s.selectByIndex(i);
			String fromcity=fromdrop.get(i).getText();
			System.out.println(fromcity);
			
			List<WebElement> tocity=t.getOptions();
			for (int j = 0; j < tocity.size(); j++) 
			{
				t.selectByIndex(j);
				String tocitytext=tocity.get(j).getText();
				
				if (fromcity.equalsIgnoreCase(tocitytext)) 
				{
					System.out.println("fromcity avaialble in to city dropdown");
					break;
				}
				
			}
			
			
		}

	}

}
