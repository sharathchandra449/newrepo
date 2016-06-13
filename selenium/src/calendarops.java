import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class calendarops {

	public static void main(String[] args) 
	{
		String date="31/august/2017";
		String[] dsplit=date.split("/");
		String day=dsplit[0];
		String month=dsplit[1];
		String year=dsplit[2];
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://cleartrip.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> rows=driver.findElements(By.xpath(".//div[@class='ctDatePicker']/div[1]/table/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++)
			{
				String calday=cols.get(j).getText();
				System.out.println(calday);
				if (calday.equals(day))
				{
					cols.get(j).click();
					flag=true;
					break;
					
				}
				
			}
			if (flag)
			{
				break;
				
			}
			
			
		}
		

	}

}
