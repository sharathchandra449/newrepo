package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class radiobutton {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("vaani");
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement group=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		
		List<WebElement> group1=group.findElements(By.name("group1"));
		System.out.println(group1.size());
		
		for (int i = 0; i < group1.size(); i++)
		{
			
			System.out.println(group1.get(i).getAttribute("value")+ " "+group1.get(i).getAttribute("checked"));
			if (group1.get(i).getAttribute("value").equalsIgnoreCase("cheese"))
			{
				group1.get(i).click();
				break;
				
			}
			
		}
		List<WebElement> group2=group.findElements(By.name("group2"));
		System.out.println(group2.size());
		
		for (int j = 0; j < group2.size(); j++)
		{
			
			System.out.println(group2.get(j).getAttribute("value")+ " "+group2.get(j).getAttribute("checked"));
			if (group2.get(j).getAttribute("value").equalsIgnoreCase("beer"))
			{
				group2.get(j).click();
				break;
				
			}
			
		}
		

	}

}
