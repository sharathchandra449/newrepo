package backup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLaunch {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		WebDriver driver1=new FirefoxDriver();
		driver1.get("Http://facebook.com");

	}

}
