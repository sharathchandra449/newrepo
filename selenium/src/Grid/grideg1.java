package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grideg1 
{
	@Test
	public void grid() throws MalformedURLException
	{
		DesiredCapabilities cap;
		
		cap=new DesiredCapabilities();
//		cap.firefox();
//		
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
		
		cap.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.21:4444/wd/hub"), cap);
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}

}
