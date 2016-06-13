package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links {

	public static void main(String[] args) 
	{
		int Cnt=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			
			
//			if (!links.get(i).getText().equals(""))
//			{
				String linktext=links.get(i).getText();
				System.out.println(i+" "+linktext);
				
//				if (linktext.equals("Gmail"))
//				{
//					links.get(i).click();
//					break;
//				}
//				else
//				{
//					System.out.println("This is not ranjinikanth link");
//				}
		
//				Cnt=Cnt+1;
				
				
				
			}
//		}
//		System.out.println(Cnt);

	}

}
